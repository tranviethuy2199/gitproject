package ss11_collectionFramework.homework.service;

import ss11_collectionFramework.homework.model.Product;

import java.util.*;

public class ProductService implements IProduct {
    private static Scanner sc = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "phone", 100));
        products.add(new Product(2, "nokia", 100));

    }


    //  thêm sản phẩm
    @Override
    public void addProduct() {
        Product product = this.ProductInfor();
        products.add(product);
        System.out.println("終了");
    }


    //  chỉnh sửa sản phẩm
    @Override
    public void editProduct() {
        Product product = this.findId();
        if (product == null) {
            System.out.println("恐れ入りますが、さがすをできません");
        } else {
            System.out.println("ID を　書いてください");
            int setId = Integer.parseInt(sc.nextLine());
            product.setId(setId);
            System.out.println("名前を書いてください");
            String setName = sc.nextLine();
            product.setName(setName);
            System.out.println("値段を書いてください ");
            double setPrice = sc.nextDouble();
            product.setPrice(setPrice);
        }
    }


    //  xóa sản phẩm
    @Override
    public void deleteProduct() {
        int delId;
        System.out.println("消したい　ID を　書いてください");
        delId = Integer.parseInt(sc.nextLine());
        for (Product product : products) {
            if (product == null) {
                System.out.println("恐れ入りますが、さがすをできません");
            } else {
                if (delId == product.getId()) {
                    System.out.println("探しません" + product.getId() + "か ?");
                    System.out.println("1 .はい !?");
                    System.out.println("2 . いいえ !?");
                    int choose = Integer.parseInt(sc.nextLine());
                    if (choose == 1) {
                        products.remove(product);
                        System.out.println("終了");
                        return;
                    }
                }
            }
        }
    }


    //  hiển thị sản phẩm
    @Override
    public void showProduct() {
        for (Product product : products) {
            System.out.println(product);
        }

    }


    //  tìm sản phẩm
    @Override
    public void findProduct() {
        System.out.println("探す名前を書いてください");
        String findName = sc.nextLine();
        int count =0;
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(findName)) {
                System.out.println(" 名前 :" + products.get(i));
                count++;
//                return products.get(i);
            }
        }
        if(count == 0){
            System.out.println("恐れ入りますが、さがすをできません");
        }

    }


    // sắp xếp theo giá trị tăng dần
    @Override
    public void sortProduct() {
        System.out.println("1.増える");
        System.out.println("2.減り");
        System.out.println("3.Exit");
        System.out.println("選んでください");
        int choice = Integer.parseInt(sc.nextLine());
        while (true) {
            switch (choice) {
                case 1:
                    Collections.sort(products, new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return o1.getPrice() > o2.getPrice() ? 1 : -1;
                        }
                    });
                    return;
                case 2:
                    Collections.sort(products, new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return o1.getPrice() > o2.getPrice() ? -1 : 1;
                        }
                    });
                    return;
                case 3:
                    return;
                default:
                    System.out.println("もう一回書いてください");
                    break;
            }
        }
    }


    private Product ProductInfor() {
        System.out.print("ID を　書いてください :  ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("名前を書いてくださ :  ");
        String name = sc.nextLine();
        System.out.print("値段を書いてください  : ");
        double price = Integer.parseInt(sc.nextLine());
        Product product = new Product(id, name, price);
        System.out.println(product);
        return product;
    }

    private Product findId() {
        System.out.println("探すIDを書いてください");
        int findId = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == findId) {
                System.out.println(" ID :" + products.get(i));
                return products.get(i);
            }
        }
        return null;

    }
}
