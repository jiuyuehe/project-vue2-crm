/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2021-05-10 08:26:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class app_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("    background: white;\r\n");
      out.write("}\r\n");
      out.write(".layui-card-header{\r\n");
      out.write("    border-left: 5px solid #009688;\r\n");
      out.write("}\r\n");
      out.write(".layui-container{\r\n");
      out.write("    margin-top:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"layui-container\">\r\n");
      out.write("    <div class=\"layui-row\">\r\n");
      out.write("           \r\n");
      out.write("    \t<!-- 近n天公司的客户增加量/损失量 -->\r\n");
      out.write("        <div class=\"layui-col-md12\">\r\n");
      out.write("            <div class=\"layui-card\">\r\n");
      out.write("               <div class=\"layui-card-header\" >客户趋势</div>\r\n");
      out.write("               <div class=\"layui-card-body\" >\r\n");
      out.write("\t\t            <form class=\"layui-form\" action=\"\" style=\"margin-top:30px;\">\r\n");
      out.write("\t\t\t\t        <div class=\"layui-form-item\" style=\"text-align:center;\">\r\n");
      out.write("\t\t\t                <div class=\"layui-inline\">\r\n");
      out.write("\t\t\t\t               <label class=\"layui-form-label\">统计</label>\r\n");
      out.write("\t\t\t\t\t            <div class=\"layui-input-inline\" style=\"width:100px;\">\r\n");
      out.write("\t\t\t\t\t                <select name=\"day\" >\r\n");
      out.write("\t\t\t\t\t                    <option value=\"7\" selected>7天</option>\r\n");
      out.write("\t\t\t\t\t                    <option value=\"30\">30天</option>\r\n");
      out.write("\t\t\t\t\t                    <option value=\"60\">60天</option>\r\n");
      out.write("\t\t\t\t\t                </select>\r\n");
      out.write("\t\t\t\t\t            </div>\r\n");
      out.write("\t\t\t\t\t            <button id=\"customerButton\" class=\"layui-btn layui-btn-primary\" type=\"button\">确定</button>\r\n");
      out.write("\t\t\t\t\t        </div>\r\n");
      out.write("\t\t\t\t\t    </div>\r\n");
      out.write("\t\t\t\t    </form>\r\n");
      out.write("\t\t\t\t\t<div id=\"customer\" style=\"width:100%;height:500px\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div><!-- 近n天公司的客户增加量/损失量 -->\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- 客户来源 -->\r\n");
      out.write("        <div class=\"layui-col-md12\" >\r\n");
      out.write("            <div class=\"layui-card\">\r\n");
      out.write("                  <div class=\"layui-card-header\" >客户来源</div>\r\n");
      out.write("                  <div class=\"layui-card-body\" >\r\n");
      out.write("                    <div id=\"customerOrigin\" style=\"width:100%;height:500px;\"></div>\r\n");
      out.write("                  </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div><!-- 客户来源 -->\r\n");
      out.write("\t\t\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("//请求数据\r\n");
      out.write("layui.use(['layer','form','table'], function(){\r\n");
      out.write("\tvar $ = layui.$;\r\n");
      out.write("    layui.form.render(\"select\");\r\n");
      out.write("\tvar customerIncrease = echarts.init(document.getElementById(\"customer\"));\r\n");
      out.write("\t\r\n");
      out.write("\t//构建公司近n天的新增/损失客户量\r\n");
      out.write("\tcreateCustomerEcharts();\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#customerButton\").click(function(){\r\n");
      out.write("\t\tcreateCustomerEcharts();\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t/**\r\n");
      out.write("\t   构建新增客户图表统计\r\n");
      out.write("\t**/\r\n");
      out.write("\tfunction createCustomerEcharts(){\r\n");
      out.write("\t\t//构建图表data数组\r\n");
      out.write("\t\tvar day = $(\"select[name=day]\").val();\r\n");
      out.write("\t\tvar increaseArray = [];  //客户增加量数组\r\n");
      out.write("\t\tvar decreaseArray = [];  //客户损失量数组\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t        url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/report/countCustomer\",\r\n");
      out.write("\t        type:\"post\",\r\n");
      out.write("\t        data:{\r\n");
      out.write("\t            \"day\": day,\r\n");
      out.write("\t        },\r\n");
      out.write("\t        asnyc:false,\r\n");
      out.write("\t        dataType:\"json\",\r\n");
      out.write("\t        beforeSend:function(){\r\n");
      out.write("\t            loading = layer.load();\r\n");
      out.write("\t        },\r\n");
      out.write("\t        success:function(res){\r\n");
      out.write("\t            var increase = res.increase; //客户增加量\r\n");
      out.write("\t            var decrease = res.decrease; //客户损失量\r\n");
      out.write("\t            \r\n");
      out.write("\t           //构建近day天前的日期json对象\r\n");
      out.write("\t            var data = {};\r\n");
      out.write("\t            for(var i = 0; i < day; i++){ \r\n");
      out.write("\t                var myDate = new Date();\r\n");
      out.write("\t                var lw = new Date(myDate - 1000 * 60 * 60 * 24 * i);//最后一个数字 i天的意思\r\n");
      out.write("\t                var lastY = lw.getFullYear();\r\n");
      out.write("\t                var lastM = lw.getMonth()+1;\r\n");
      out.write("\t                var lastD = lw.getDate();\r\n");
      out.write("\t                var startdate=(lastM<10 ? \"0\" + lastM : lastM)+\"-\"+(lastD<10 ? \"0\"+ lastD : lastD);\r\n");
      out.write("\t                data[startdate] = 0 ;\r\n");
      out.write("\t            }\r\n");
      out.write("\t            \r\n");
      out.write("\t            var increaseJson = {};  //构建json对象，日期为key 统计数值为value\r\n");
      out.write("\t            for(var i=0; i < increase.length;i++ ){\r\n");
      out.write("\t            \tincreaseJson[increase[i].date] = increase[i].count;\r\n");
      out.write("\t            }\r\n");
      out.write("\t            \r\n");
      out.write("\t            var decreaseJson = {};//构建json对象，日期为key 统计数值为value\r\n");
      out.write("\t            for(var i=0; i < decrease.length; i++){\r\n");
      out.write("\t            \tdecreaseJson[decrease[i].date] = decrease[i].count;\r\n");
      out.write("\t            }\r\n");
      out.write("\t           \r\n");
      out.write("\t            //构建图表data数组\r\n");
      out.write("\t            for(var key in data){\r\n");
      out.write("\t            \tif(increaseJson[key] != null){\r\n");
      out.write("\t            \t\tincreaseArray.unshift([key, increaseJson[key]]);\r\n");
      out.write("\t            \t}else{\r\n");
      out.write("\t            \t\tincreaseArray.unshift([key, data[key]]);\r\n");
      out.write("\t            \t}\r\n");
      out.write("\t            \t\r\n");
      out.write("\t            \t\r\n");
      out.write("\t            \tif(decreaseJson[key] != null){\r\n");
      out.write("\t            \t\tdecreaseArray.unshift([key, decreaseJson[key]]);\r\n");
      out.write("\t            \t}else{\r\n");
      out.write("\t            \t\tdecreaseArray.unshift([key, data[key]]);\r\n");
      out.write("\t            \t}\r\n");
      out.write("\t            \t\r\n");
      out.write("\t            }\r\n");
      out.write("\t            console.log(increaseArray);\r\n");
      out.write("\t            console.log(decreaseArray);\r\n");
      out.write("\t        },\r\n");
      out.write("\t        error:function(){\r\n");
      out.write("\t            layer.msg(\"服务器开小差了!\");\r\n");
      out.write("\t        },\r\n");
      out.write("\t        complete:function(){\r\n");
      out.write("\t            layer.close(loading);\r\n");
      out.write("\t            \r\n");
      out.write("\t            var option = {\r\n");
      out.write("\t                title : {\r\n");
      out.write("\t                    text: '客户新增趋势',\r\n");
      out.write("\t                },\r\n");
      out.write("\t                tooltip:{  //鼠标经过显示提示框\r\n");
      out.write("\t                \tshow : true,\r\n");
      out.write("\t                \ttrigger: \"axis\",\r\n");
      out.write("\t                },\r\n");
      out.write("\t                legend:{  //不同的线的类型\r\n");
      out.write("\t                \tdata: [\"客户新增量\", \"客户损失量\"],\r\n");
      out.write("\t                },\r\n");
      out.write("\t                xAxis: {\r\n");
      out.write("\t                    name: \"时间\",\r\n");
      out.write("\t                    type: 'category', \r\n");
      out.write("\t                },\r\n");
      out.write("\t                yAxis: {\r\n");
      out.write("\t                    name: \"新增/损失 客户量\",\r\n");
      out.write("\t                    type: 'value',\r\n");
      out.write("\t                },\r\n");
      out.write("\t                toolbox:{  //工具栏\r\n");
      out.write("\t                    show: true,\r\n");
      out.write("\t                    feature:{\r\n");
      out.write("\t                        dataView: {readOnly: false},  \r\n");
      out.write("\t                        magicType: {type: ['line', 'bar']},  //图形切换\r\n");
      out.write("\t                        restore: {},\r\n");
      out.write("\t                        saveAsImage: {},\r\n");
      out.write("\t                    },\r\n");
      out.write("\t                },\r\n");
      out.write("\t                dataZoom: [  //滚动条\r\n");
      out.write("\t                    {\r\n");
      out.write("\t                        type: 'slider',\r\n");
      out.write("\t                        show: true,\r\n");
      out.write("\t                        start: 0,\r\n");
      out.write("\t                        end: 100,\r\n");
      out.write("\t                    },\r\n");
      out.write("\t                ],\r\n");
      out.write("\t                series: [\r\n");
      out.write("\t                \t{\r\n");
      out.write("\t                \t\tname: \"客户新增量\",\r\n");
      out.write("\t\t                    data: increaseArray, \r\n");
      out.write("\t\t                    type: 'line'\r\n");
      out.write("\t\t                },\r\n");
      out.write("\t                \t{\r\n");
      out.write("\t\t                \tname: \"客户损失量\",\r\n");
      out.write("\t\t                \tdata: decreaseArray,\r\n");
      out.write("\t\t                \ttype: \"line\",\r\n");
      out.write("\t                \t}\r\n");
      out.write("\t                ],\r\n");
      out.write("\t            };\r\n");
      out.write("\t            \r\n");
      out.write("\t            customerIncrease.setOption(option);\r\n");
      out.write("\t        }\r\n");
      out.write("\t    });\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t//客户来源\r\n");
      out.write("\tvar customerOrigin = echarts.init(document.getElementById(\"customerOrigin\"));\r\n");
      out.write("\tcreateCustomerOrigin();\r\n");
      out.write("\tfunction createCustomerOrigin(){\r\n");
      out.write("\t\tvar data = [];\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl: \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/report/countCustomerSource\",\r\n");
      out.write("\t\t\ttype:\"get\",\r\n");
      out.write("\t\t\tdata:{\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdataType:\"json\",\r\n");
      out.write("\t\t\tasnyc:false,\r\n");
      out.write("\t\t\tbeforeSend:function(){\r\n");
      out.write("\t\t\t\tloading = layer.load();\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess:function(res){\r\n");
      out.write("\t\t\t\tif(res.code == 0){\r\n");
      out.write("\t\t\t\t\tvar resData = res.data;\r\n");
      out.write("\t\t\t\t\tconsole.log(resData);\r\n");
      out.write("\t\t\t\t\tfor(var i=0;i<resData.length;i++){\r\n");
      out.write("\t\t\t\t\t\tvar json = {};\r\n");
      out.write("\t\t\t\t\t\tif(resData[i].source == \"\"){\r\n");
      out.write("\t\t\t\t\t\t\tjson.name = \"不清楚\";\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\tjson.name = resData[i].source;\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\tjson.value = resData[i].count;\r\n");
      out.write("\t\t\t\t\t\tdata.push(json);\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tlayer.msg(res.msg);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror:function(){\r\n");
      out.write("\t\t\t\tlayer.msg(\"服务器出小差了!\");\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tcomplete:function(){\r\n");
      out.write("\t\t\t\tlayer.close(loading);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar option = {\r\n");
      out.write("\t\t\t\t    title : {\r\n");
      out.write("\t\t\t\t        text: '公司客户来源统计',\r\n");
      out.write("\t\t\t\t        subtext: '东软客户关系管理系统',\r\n");
      out.write("\t\t\t\t        x:'center'\r\n");
      out.write("\t\t\t\t    },\r\n");
      out.write("\t\t\t\t    tooltip : {\r\n");
      out.write("\t\t\t\t        trigger: 'item',\r\n");
      out.write("\t\t\t\t        formatter: \"{a} <br/>{b} : {c} ({d}%)\"\r\n");
      out.write("\t\t\t\t    },\r\n");
      out.write("\t\t\t\t    legend: {\r\n");
      out.write("\t\t\t\t    \ttype: \"scroll\",\r\n");
      out.write("\t\t\t\t        orient: 'vertical',\r\n");
      out.write("\t\t\t\t        left: 'left',\r\n");
      out.write("\t\t\t\t        \r\n");
      out.write("\t\t\t\t    },\r\n");
      out.write("\t\t\t\t    series : [\r\n");
      out.write("\t\t\t\t        {\r\n");
      out.write("\t\t\t\t            name: '客户量',\r\n");
      out.write("\t\t\t\t            type: 'pie',\r\n");
      out.write("\t\t\t\t            radius : '55%',\r\n");
      out.write("\t\t\t\t            center: ['50%', '60%'],\r\n");
      out.write("\t\t\t\t            data:data,\r\n");
      out.write("\t\t\t\t            itemStyle: {\r\n");
      out.write("\t\t\t\t                emphasis: {\r\n");
      out.write("\t\t\t\t                    shadowBlur: 10,\r\n");
      out.write("\t\t\t\t                    shadowOffsetX: 0,\r\n");
      out.write("\t\t\t\t                    shadowColor: 'rgba(0, 0, 0, 0.5)'\r\n");
      out.write("\t\t\t\t                }\r\n");
      out.write("\t\t\t\t            }\r\n");
      out.write("\t\t\t\t        }\r\n");
      out.write("\t\t\t\t    ]\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\tcustomerOrigin.setOption(option);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}