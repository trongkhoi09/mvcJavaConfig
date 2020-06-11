package com.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@Controller
public class FileUploadController {

    @RequestMapping(value = "fileupload", method = RequestMethod.GET)
    public String upFile(){
        return "fileupload";
    }

    @RequestMapping(value = "file-result", method = RequestMethod.POST)
    public String upFileHandle(Model model, @RequestParam(name = "file") MultipartFile file){
////        save file
//        try {
//            File saveFile = new File("/home/khoipc/save/"+ file.getOriginalFilename());
//            FileOutputStream fileOutputStream = new FileOutputStream(saveFile);
//            fileOutputStream.write(file.getBytes());
//            fileOutputStream.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        model.addAttribute("fileResult", file);
        return "file-result";
    }

//    @RequestMapping(value = "save",method = RequestMethod.GET)
//    public void save(HttpServletResponse response)  {
//        String directory="/home/khoipc/Downloads/";
//        Path file= Paths.get(directory,"spring.png");
//        if(Files.exists(file)){
//            response.setContentType("image/png");
//            response.addHeader("Content-Disposition","attachment; filename=anh.png");
//            try {
//                Files.copy(file,response.getOutputStream());
//                response.getOutputStream().flush();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//    }

    @RequestMapping(value = "savefile/{originalFilename}",method = RequestMethod.GET)
    public void savefile(HttpServletResponse response,@PathVariable(value = "originalFilename") String filename)  {
        String directory="/home/khoipc/Downloads/";
        Path file= Paths.get(directory,filename);
        if(Files.exists(file)){
            response.setContentType("image/png");
            response.addHeader("Content-Disposition","attachment; filename=anh1.png");
            try {
                Files.copy(file,response.getOutputStream());
                response.getOutputStream().flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
