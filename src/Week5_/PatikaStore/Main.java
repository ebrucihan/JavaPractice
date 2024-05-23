package Week5_.PatikaStore;


import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("PatikaStore Ürün Yönetim Paneline Hoşgeldiniz!");
        System.out.println("=========================================");

        while (true) {
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz: ");
            int select = input.nextInt();


            switch (select) {
                case 1:
                    HashSet<NoteBook> noteBooks = new HashSet<>();
                    noteBooks.add(new NoteBook(1, "HUAWEI MateBook 14", "7000.0 TL", "Huawai", 512, 14.0, 16));
                    noteBooks.add(new NoteBook(2, "LENOVO V14 IGL", "3600.0 TL", "Lenovo", 1024, 14.0, 8));
                    noteBooks.add(new NoteBook(3, "ASUS Tuf Gaming", "8199.0 TL", "Asus", 2048, 15.6, 32));

                    System.out.println("----------------------------------------------------------------------------------------------------");
                    System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    for (NoteBook nb : noteBooks) {
                        System.out.println(nb);

                    }
                    System.out.println("----------------------------------------------------------------------------------------------------");
                    break;
                case 2:
                    HashSet<MobilePhone> mobilePhones = new HashSet<>();
                    mobilePhones.add(new MobilePhone(1, "SAMSUNG GALAXY A51", "3199.0 TL", "Samsung", 128, 6.5, 32, 4000.0, 6, "Siyah"));
                    mobilePhones.add(new MobilePhone(2, "IPHONE 11 64 GB", "7379.0 TL", "Apple", 64, 6.1, 5, 3046.0, 6, "Mavi"));
                    mobilePhones.add(new MobilePhone(3, "REDMI NOTE 10 Pro 8GB", "4012.0 TL", "Xiaomi", 128, 6.5, 35, 4000.0, 12, "Beyaz"));

                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama    | Ekran     | Kamera      | Pil         | RAM       | Renk      |");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");

                    for (MobilePhone mp : mobilePhones) {
                        System.out.println(mp);
                    }
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
                    break;

                case 3:
                    TreeSet<Brand> brands = new TreeSet<>(new OrderNameComperator());
                    System.out.println("----------------------");
                    brands.add(new Brand("-Samsung"));
                    brands.add(new Brand("-Lenovo"));
                    brands.add(new Brand("-Apple"));
                    brands.add(new Brand("-Huawei"));
                    brands.add(new Brand("-Casper"));
                    brands.add(new Brand("-Asus"));
                    brands.add(new Brand("-HP"));
                    brands.add(new Brand("-Xiaomi"));
                    brands.add(new Brand("-Monster"));

                    for (Brand br : brands) {
                        System.out.println(br.getName());
                    }
                    System.out.println("----------------------");
                    break;


                case 0:
                    System.out.println("Çıkış yapıldı. Görüşmek üzere!!");
                    return;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
                    break;

            }
        }

        }
    }
