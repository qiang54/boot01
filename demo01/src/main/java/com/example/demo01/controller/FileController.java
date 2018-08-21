package com.example.demo01.controller;

import com.example.demo01.domain.JsonData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

/**
 * 文件上传
 */
@Controller
@PropertySource("classpath:application.properties")
public class FileController {


//    private static final String filePath =
//            "C:\\Users\\H2\\IdeaProjects\\boot01\\demo01\\src\\main\\resources\\images\\";

    @Value("${web.upload.path}")
    private   String filePath ;

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "hello world";
    }

    @RequestMapping("/upload")
    @ResponseBody
    public  JsonData upload(@RequestParam("head_img") MultipartFile file, HttpServletRequest request){

        String name = request.getParameter("name");
        System.out.println("用户名" + name);

        String filename = file.getOriginalFilename();
        System.out.println("文件名" + filename);

        String suffName = filename.substring(filename.lastIndexOf("."));
        System.out.println("后缀名"  + suffName);

        filename = UUID.randomUUID() + suffName;
        System.out.println(filename);

        File dest = new File(filePath + filename);

        try{
            file.transferTo(dest);
            return new JsonData(0,filename);
        }catch (Exception e){
            e.printStackTrace();
        }

        return new JsonData(-1, "fial to save", null);


    }

}
