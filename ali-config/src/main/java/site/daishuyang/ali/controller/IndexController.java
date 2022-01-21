package site.daishuyang.ali.controller;

import cn.hutool.crypto.SecureUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import site.daishuyang.ali.bean.AliInfo;
import site.daishuyang.ali.config.AliConfig;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author steven
 * @date 2022-01-19 18:26
 */
@Controller
public class IndexController {

    @Resource
    private AliConfig aliConfig;

    @GetMapping("")
    public String index(Model model){
        List<AliInfo> aliInfos = aliInfos();
        model.addAttribute("aliInfos", aliInfos);
        return "login";
    }

    /**
     * 获取配置信息
     * @author steven
     * @date 2022/1/19 18:40
     * @return java.util.List<site.daishuyang.ali.bean.AliInfo>
     */
    private List<AliInfo> aliInfos(){
        List<AliInfo> aliInfos = aliConfig.getAliInfos();
        return aliInfos.stream().map(aliInfo -> {
            AliInfo info = new AliInfo();
            info.setId(aliInfo.getId());
            info.setDesc(aliInfo.getDesc());
            return info;
        }).collect(Collectors.toList());
    }

    @PostMapping("login")
    public String login(Integer aliId,String account, Model model){
        // 根据ID查询是否存在
        List<AliInfo> aliInfos = aliConfig.getAliInfos();
        Optional<AliInfo> info = aliInfos.stream().filter(aliInfo -> aliInfo.getId().equals(aliId)&aliInfo.getAccount().equals(account)).findFirst();
        String token = null;
        if(info.isPresent()){
            // 根据ID生成临时token
            String desInfo = aliId+":"+System.currentTimeMillis()+":"+ account;
            token = SecureUtil.des(AliConfig.DES_KEY.getBytes()).encryptBase64(desInfo);
            model.addAttribute("token", token);
            return "index";
        }else{
            model.addAttribute("msg", "登录失败！");
            return "login";
        }
    }
}



