package ss16_Binary_Serialization.homework.copyFile.controller;

import ss8_CleanCode.pratice.Refactoring.Model.Calculate;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class copyFile {
    // đây là hàm viết
//        File file = new File("src\\ss16_Binary_Serialization\\homework\\copyFile\\data\\data.txt");
//        FileOutputStream fileOutputStream = new FileOutputStream("src\\ss16_Binary_Serialization\\homework\\copyFile\\data\\data.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject("tran viet huy ");
//        objectOutputStream.close();
//
//
//        // đây là hàm đọc
//        File fileCopy = new File("src\\ss16_Binary_Serialization\\homework\\copyFile\\data\\textData.txt");
//        FileInputStream fileInputStream = new FileInputStream("src\\ss16_Binary_Serialization\\homework\\copyFile\\data\\data.txt");
//        FileInputStream copyFile = new FileInputStream("src\\ss16_Binary_Serialization\\homework\\copyFile\\data\\textData.txt");
//
//        int i = -1;
//        byte[] bytes = new byte[1024];
//        while ((i = fileInputStream.read(bytes)) != -1) {
//            file.w
//        }
////        try {
////            Files.copy(file.toPath(),fileCopy.toPath(),StandardCopyOption.REPLACE_EXISTING);
////            //copyFileUsingStream(sourceFile, destFile);
////            System.out.printf("Copy completed");
////        } catch (IOException ioe) {
////            System.out.printf("Can't copy that file");
////            System.out.printf(ioe.getMessage());
////        }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }

    }


    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter source file:");
        String sourcePath = in.nextLine();
        System.out.printf("Enter destination file:");
        String destPath = in.nextLine();

        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);

        long size = sourcePath.getBytes().length;
        System.out.println("số byte trong tệp là " + size);



        try {
            copyFileUsingJava7Files(sourceFile, destFile);
            //copyFileUsingStream(sourceFile, destFile);
            System.out.printf("Copy completed");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }

    }


}
