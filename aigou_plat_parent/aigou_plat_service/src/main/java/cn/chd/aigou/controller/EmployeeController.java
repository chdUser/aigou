package cn.chd.aigou.controller;

import cn.chd.aigou.domain.Employee;
import cn.chd.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("chd".equals(employee.getName()) && "asd".equals(employee.getPwd())){
            return AjaxResult.me();
        }
        return AjaxResult.me().setSuccess(false).setMsg("登录失败");
    }
}
