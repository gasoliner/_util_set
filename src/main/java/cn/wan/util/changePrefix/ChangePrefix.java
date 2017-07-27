package cn.wan.util.changePrefix;

import cn.wan.common.In;

import java.io.File;
import java.util.List;

/**
 * Created by wanzhenghang on 2017/7/27.
 */
public class ChangePrefix {

    private String path;

    public void changeAllByPath(){
        System.out.println("该程序用于批量修改某个文件夹所有文件的后缀名");
        System.out.println("请输入文件夹路径：");
        String path = In.readLine();
        System.out.println("请输入要修改的后缀名：");
        String tobepre = In.readLine();
        File file = new File(path);
        if (file.isDirectory()){
            String [] stringList = file.list();
            for (String tempFile:
                 stringList) {
                renameFile(path + "\\" + tempFile,path + "\\" + noPrefix(tempFile) + tobepre);
            }
        }else {
            System.out.println("文件夹路径出错.");
        }
    }

    public String noPrefix(String filename){

//        return filename.substring(0,filename.indexOf('.'));
        return filename.replaceAll("\\..*","");
    }

    public File renameFile(String file , String toFile){
        File tobefile = new File(file);
        if (tobefile.isFile()){
            File newfile = new File(toFile);
            tobefile.renameTo(newfile);
            return tobefile;
        }
        return null;
    }

}
