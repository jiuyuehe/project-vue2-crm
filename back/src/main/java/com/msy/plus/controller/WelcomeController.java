package com.msy.plus.controller;


import com.msy.plus.core.response.Result;
import com.msy.plus.core.response.ResultGenerator;
import com.msy.plus.entity.Welcome;
import com.msy.plus.service.WelcomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Api(tags="欢迎模块")
@RestController
public class WelcomeController {

        @Autowired
        private WelcomeService welcomeService;

        @ApiOperation(value = "获得名人名言")
        @GetMapping("welcome")
        public Result<Welcome> getWise(){
            return ResultGenerator.genOkResult(welcomeService.getRandom());
        }

}
