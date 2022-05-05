package cn.ztuo.mbg;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

/**
 * 自定义注释生成器
 *
 * @author ztuo
 * @since 2019/11/19.
 */
public class CommentGenerator extends DefaultCommentGenerator {

    private boolean addRemarkComments = false;
    private static final String EXAMPLE_SUFFIX = "Example";
    private static final String API_MODEL_PROPERTY_FULL_CLASS_NAME = "io.swagger.annotations.ApiModelProperty";
    private static final String CONVERT_STR = "\"";

    private static final SimpleDateFormat DATEFORMATTER = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final String AUTHOR = "ztuo";
    private static final String SEPARATOR = System.getProperty("line.separator");

    /**
     * 设置用户配置的参数
     */
    @Override
    public void addConfigurationProperties(Properties properties) {
        super.addConfigurationProperties(properties);
        this.addRemarkComments = StringUtility.isTrue(properties.getProperty("addRemarkComments"));
    }

    /**
     * 给字段添加注释
     */
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
            IntrospectedColumn introspectedColumn) {
        String remarks = introspectedColumn.getRemarks();
        // 根据参数和备注信息判断是否添加备注信息
        if (addRemarkComments && StringUtility.stringHasValue(remarks)) {
            addFieldJavaDoc(field, remarks);
            // 数据库中特殊字符需要转义
            if (remarks.contains(CONVERT_STR)) {
                remarks = remarks.replace(CONVERT_STR, "'");
            }
            // 给model的字段添加swagger注解
            field.addJavaDocLine("@ApiModelProperty(value = \"" + remarks + "\")");
        }
    }

    /**
     * 给model的字段添加注释
     */
    private void addFieldJavaDoc(Field field, String remarks) {
        // 文档注释开始
        field.addJavaDocLine("/**");
        // 获取数据库字段的备注信息
        String[] remarkLines = remarks.split(SEPARATOR);
        for (String remarkLine : remarkLines) {
            field.addJavaDocLine(" * " + remarkLine);
        }
        field.addJavaDocLine(" */");
    }

    @Override
    public void addJavaFileComment(CompilationUnit compilationUnit) {
        super.addJavaFileComment(compilationUnit);
        // 只在model中添加swagger注解类的导入
        if (!compilationUnit.isJavaInterface()
                && !compilationUnit.getType().getFullyQualifiedName().contains(EXAMPLE_SUFFIX)) {
            compilationUnit.addImportedType(new FullyQualifiedJavaType(API_MODEL_PROPERTY_FULL_CLASS_NAME));
        } else {
            compilationUnit.addFileCommentLine(javaFileComment());
        }
    }

    private String javaFileComment() {
        StringBuffer sb = new StringBuffer();
        sb.append("/**" + SEPARATOR);
        sb.append(" *" + SEPARATOR);
        sb.append(" * @author " + AUTHOR + SEPARATOR);
        sb.append(" * @date " + DATEFORMATTER.format(new Date()) + SEPARATOR);
        sb.append(" */");
        return sb.toString();
    }

    @Override
    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        // 获取表注释
        String remarks = introspectedTable.getRemarks();
        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" * " + remarks);
        topLevelClass.addJavaDocLine(" *");
        topLevelClass.addJavaDocLine(" * @author " + AUTHOR);
        topLevelClass.addJavaDocLine(" * @date " + DATEFORMATTER.format(new Date()));
        topLevelClass.addJavaDocLine(" */");
    }

    @Override
    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
        method.addJavaDocLine("/**");
        method.addJavaDocLine(" * " + method.getName());
        method.addJavaDocLine(" * ");
        List<Parameter> params = method.getParameters();
        for (Parameter parameter : params) {
            method.addJavaDocLine(" * @param " + parameter.getName());
        }
        method.addJavaDocLine(" * @return " + method.getReturnType());
        method.addJavaDocLine(" */");
    }
}
