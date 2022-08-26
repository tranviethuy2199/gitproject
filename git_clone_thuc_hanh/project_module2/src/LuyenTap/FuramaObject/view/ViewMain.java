package LuyenTap.FuramaObject.view;

import LuyenTap.FuramaObject.controller.FurumaController;

import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ViewMain {
    public static void main(String[] args) throws IOException {
        FurumaController furumaController = new FurumaController();
        furumaController.generalManagement();
    }
}
//        LocalDate now = LocalDate.now();
//        System.out.println(now);
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ngày bắt đầu");
//        String ngayBatDau;
//        LocalDate nBBD;
//        ngayBatDau = sc.nextLine();
//        nBBD = LocalDate.parse(ngayBatDau);
//
////  (^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)"
////                if (ngayBatDau.matches("\\d{2}[/]\\d{2}[/]\\d{4}")) {
////                    break;
////                }else {
////                    throw new InputMismatchException("Nhập sai thời gian hoặc định dạng \n" +
////                            "Hãy nhập theo dạng dd/MM/yyy ");
////                }
////            }catch (Exception e) {
////                System.out.println(e.getMessage());
////                //throw new InputMismatchException("không nên nhập ký tự số");
////            }
////        }
//        System.out.println("Ngày kết thúc ");
//        String ngayKetThuc;
//
//        ngayKetThuc = sc.nextLine();
//        LocalDate nKT = LocalDate.parse(ngayKetThuc);
//        if (nKT.isBefore(nBBD)) {
//            System.out.println("ok");
//        } else {
//            System.out.println("not ok!");
//        }
//    }
//}
////                        if (ngayKetThuc.matches("\\d{2}[/]\\d{2}[/]\\d{4}")) {
////                            break;
////                        } else {
////                            throw new InputMismatchException("Nhập sai thời gian hoặc định dạng \n" +
////                                    "Hãy nhập theo dạng dd/MM/yyy ");
////                        }
////                    } catch (Exception e) {
////                        System.out.println(e.getMessage());
////                        //throw new InputMismatchException("không nên nhập ký tự số");
////                    }
//
////
////    };


