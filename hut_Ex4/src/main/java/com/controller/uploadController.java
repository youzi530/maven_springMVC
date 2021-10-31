package com.controller;

import com.domain.Infomation;
import com.domain.Login;
import com.service.loginService;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class uploadController {
//    private String uploadFileName;                    //上传的文件名
    private Infomation info = new Infomation();
    private String path;

    @Autowired
    loginService loginService;

    @RequestMapping("/fileupload")
    public String fileUpload(HttpServletRequest request, MultipartFile upload) throws Exception {
        request.setCharacterEncoding("UTF-8");
        System.out.println("文件上传了！");
//        获取文件名
        String uploadFileName = upload.getOriginalFilename();
//        分割文件后缀
        String[] strAry = uploadFileName.split("\\.");
        int length = strAry.length - 1;
        String suffix = strAry[length]; //文件后缀
        System.out.println(suffix);
        if (suffix.equals("txt")) {
            InputStream is = upload.getInputStream();
            HttpSession session = request.getSession();
            Login user = (Login) session.getAttribute("user");
            path = "d:\\";
//            上传的文件名
            String fileName = user.getName()+"-"+uploadFileName;
            upload.transferTo(new File(path,fileName));
//            数据插入数据库
            System.out.println(uploadFileName);
            info.setFileName(uploadFileName);
            info.setId(user.getId());
            info.setPath(path);
            loginService.saveInfo(info);
            return "success";
        }else
            return "error";
    }
}
