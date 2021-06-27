
package com.hitesh_sahu.retailapp.domain.mock;

import com.hitesh_sahu.retailapp.model.CenterRepository;
import com.hitesh_sahu.retailapp.model.entities.Product;
import com.hitesh_sahu.retailapp.model.entities.ProductCategoryModel;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/*
 * This class serve as fake server and provides dummy product and category with real Image Urls taken from flipkart
 */
public class FakeWebServer {

    private static FakeWebServer fakeServer;

    public static FakeWebServer getFakeWebServer() {

        if (null == fakeServer) {
            fakeServer = new FakeWebServer();
        }
        return fakeServer;
    }

    void initiateFakeServer() {

        addCategory();

    }

    public void addCategory() {

        ArrayList<ProductCategoryModel> listOfCategory = new ArrayList<ProductCategoryModel>();

        listOfCategory
                .add(new ProductCategoryModel(
                        "Electronic",
                        "Electric Items",
                        "10%",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSeNSONF3fr9bZ6g0ztTAIPXPRCYN9vtKp1dXQB2UnBm8n5L34r"));

        listOfCategory
                .add(new ProductCategoryModel(
                        "Furnitures",
                        "Furnitures Items",
                        "15%",
                        "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRaUR5_wzLgBOuNtkWjOxhgaYaPBm821Hb_71xTyQ-OdUd-ojMMvw"));

        CenterRepository.getCenterRepository().setListOfCategory(listOfCategory);
    }

    public void getAllElectronics() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> productlist = new ArrayList<Product>();

        // Ovens
        productlist
                .add(new Product(
                        "Solo Microwave Oven",
                        "IFB 17PMMEC1 17 L Solo Microwave Oven",
                        "Explore the joys of cooking with IFB 17PM MEC1 Solo Microwave Oven. The budget-friendly appliance has several nifty features including Multi Power Levels and Speed Defrost to make cooking a fun-filled experience.",
                        "5490",
                        "10",
                        "4290",
                        "0",
                        "https://pyxis.nymag.com/v1/imgs/898/e9e/b9a917553c28fc6aff930af317823db693-microwave-lede.rhorizontal.w700.jpg",
                        "oven_1"));

        productlist
                .add(new Product(
                        "Solo Microwave Oven",
                        "Bajaj 1701MT 17 L Solo Microwave Oven",
                        "Explore the joys of cooking with IFB 17PM MEC1 Solo Microwave Oven. The budget-friendly appliance has several nifty features including Multi Power Levels and Speed Defrost to make cooking a fun-filled experience.",
                        "5000",
                        "10",
                        "4290",
                        "0",
                        "https://pyxis.nymag.com/v1/imgs/ad7/682/092c348f19eafb0e9156e0073dbaad5e9d-amazon-basics.rhorizontal.w600.jpg",
                        "oven_2"));

        productlist
                .add(new Product(
                        "Solo Microwave Oven",
                        "Whirlpool MW 25 BG 25 L Grill Microwave Oven",
                        "Explore the joys of cooking with IFB 17PM MEC1 Solo Microwave Oven. The budget-friendly appliance has several nifty features including Multi Power Levels and Speed Defrost to make cooking a fun-filled experience.",
                        "5290",
                        "10",
                        "4290",
                        "0",
                        "https://m.media-amazon.com/images/I/81JE6RmFzfL._AC_UY218_.jpg",
                        "oven_3"));

        productlist
                .add(new Product(
                        "Solo Microwave Oven",
                        "Morphy Richards 25CG 25 L Convection Microwave Oven",
                        "Explore the joys of cooking with IFB 17PM MEC1 Solo Microwave Oven. The budget-friendly appliance has several nifty features including Multi Power Levels and Speed Defrost to make cooking a fun-filled experience.",
                        "5300",
                        "12",
                        "4290",
                        "0",
                        "https://pyxis.nymag.com/v1/imgs/ff8/220/4531e01500431f1ae12b27ee65c9875886.rhorizontal.w600.jpg",
                        "oven_4"));

        productlist
                .add(new Product(
                        "Solo Microwave Oven",
                        "IFB 25SC4 25 L Convection Microwave Oven",
                        "Explore the joys of cooking with IFB 17PM MEC1 Solo Microwave Oven. The budget-friendly appliance has several nifty features including Multi Power Levels and Speed Defrost to make cooking a fun-filled experience.",
                        "5190",
                        "10",
                        "4290",
                        "0",
                        "https://pyxis.nymag.com/v1/imgs/85c/fe6/49d22641a117abe1878f1db2be982efbee.rhorizontal.w600.jpg",
                        "oven_5"));

        productMap.put("Microwave oven", productlist);

        ArrayList<Product> tvList = new ArrayList<Product>();

        // TV
        tvList.add(new Product(
                "LED",
                "Vu 80cm (32) HD Ready LED TV",
                "Enjoy movie night with the family on this 80cm LED TV from Vu. With an A+ grade panel, this TV renders crisp details that make what you're watching look realistic.",
                "16000",
                "12",
                "13990",
                "0",
                "https://images.samsung.com/is/image/samsung/n-africa-qledtv-q70t-qa65q70tauxmv-frontsilver-237364086?$684_547_PNG$",
                "tv_1"));

        tvList.add(new Product(
                "LED 1",
                "Vu 80cm (32) HD Ready LED TV",
                "Enjoy movie night with the family on this 80cm LED TV from Vu. With an A+ grade panel, this TV renders crisp details that make what you're watching look realistic.",
                "17000",
                "12",
                "13990",
                "0",
                "https://images.samsung.com/is/image/samsung/n-africa-qledtv-q70t-qa65q70tauxmv-frontsilver-237364086?$684_547_PNG$",
                "tv_2"));

        tvList.add(new Product(
                "LED 2",
                "Vu 80cm (32) HD Ready LED TV",
                "Enjoy movie night with the family on this 80cm LED TV from Vu. With an A+ grade panel, this TV renders crisp details that make what you're watching look realistic.",
                "18000",
                "12",
                "13990",
                "0",
                "https://images.samsung.com/is/image/samsung/n-africa-qledtv-q70t-qa65q70tauxmv-frontsilver-237364086?$684_547_PNG$",
                "tv_3"));

        tvList.add(new Product(
                "LED 3",
                "Vu 80cm (32) HD Ready LED TV",
                "Enjoy movie night with the family on this 80cm LED TV from Vu. With an A+ grade panel, this TV renders crisp details that make what you're watching look realistic.",
                "16000",
                "12",
                "13990",
                "0",
                "https://images.samsung.com/is/image/samsung/n-africa-qledtv-q70t-qa65q70tauxmv-frontsilver-237364086?$684_547_PNG$",
                "tv_4"));

        tvList.add(new Product(
                "LED 4",
                "Vu 80cm (32) HD Ready LED TV",
                "Enjoy movie night with the family on this 80cm LED TV from Vu. With an A+ grade panel, this TV renders crisp details that make what you're watching look realistic.",
                "16000",
                "12",
                "13990",
                "0",
                "https://images.samsung.com/is/image/samsung/n-africa-qledtv-q70t-qa65q70tauxmv-frontsilver-237364086?$684_547_PNG$",
                "tv_5"));

        productMap.put("Television", tvList);

        productlist = new ArrayList<Product>();

        // Vaccum Cleaner
        productlist
                .add(new Product(
                        "Easy Clean Plus Hand-held ",
                        "Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
                        "The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
                        "2699",
                        "10",
                        "2566",
                        "0",
                        "https://ma.jumia.is/unsafe/fit-in/500x500/filters:fill(white)/product/54/400842/1.jpg?8925",
                        "v_cleaner_1"));

        productlist
                .add(new Product(
                        "Easy Clean Plus Hand-held ",
                        "Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
                        "The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
                        "2699",
                        "10",
                        "2566",
                        "0",
                        "https://ma.jumia.is/unsafe/fit-in/500x500/filters:fill(white)/product/30/496263/1.jpg?3988",
                        "v_cleaner_2"));

        productlist
                .add(new Product(
                        "Easy Clean Plus Hand-held ",
                        "Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
                        "The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
                        "2699",
                        "10",
                        "2566",
                        "0",
                        "https://ma.jumia.is/unsafe/fit-in/300x300/filters:fill(white)/product/79/079093/1.jpg?9394",
                        "v_cleaner_3"));

        productlist
                .add(new Product(
                        "Easy Clean Plus Hand-held ",
                        "Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
                        "The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
                        "2699",
                        "10",
                        "2566",
                        "0",
                        "https://ma.jumia.is/unsafe/fit-in/500x500/filters:fill(white)/product/79/441593/1.jpg?0465",
                        "v_cleaner_4"));

        productlist
                .add(new Product(
                        "Easy Clean Plus Hand-held ",
                        "Eureka Forbes Easy Clean Plus Hand-held Vacuum Cleaner",
                        "The Eureka Forbes Easy Clean vacuum cleaner is best for those who are looking for a machine that makes cleaning easier and is convenient to use. It is a compact and powerful machine with high suction and low power consumption.",
                        "2699",
                        "10",
                        "2566",
                        "0",
                        "https://ma.jumia.is/unsafe/fit-in/500x500/filters:fill(white)/product/79/441593/1.jpg?0465",
                        "v_cleaner_5"));

        productMap.put("Vaccum Cleaner", productlist);


        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

    }

    public void getAllFurnitures() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> productlist = new ArrayList<Product>();

        // Table
        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "https://images.demandware.net/dw/image/v2/BBBV_PRD/on/demandware.static/-/Sites-master-catalog/default/dw9fc54f37/images/530000/533591.jpg?sw=1600",
                        "table_1"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "https://www.ekbotefurniture.com/wp-content/uploads/2018/12/MODERN-GLASS-COFFEE-TABLE-1.jpg",
                        "table_2"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "bhttps://www.ekbotefurniture.com/wp-content/uploads/2020/02/table-1-600x400.jpg",
                        "table_3"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "https://www.italydreamdesign.com/wp-content/themes/iddchild-child/phpThumb/phpThumb.php?src=/wp-content/uploads/Niky2.jpg&w=510&h=600&zc=1&q=100&iar=1",
                        "table_4"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "https://www.ekbotefurniture.com/wp-content/uploads/2019/01/LARGE-GLASS-TOPPED-DINING-TABLE-5x3-600x660.jpg",
                        "table_5"));

        productlist
                .add(new Product(
                        " Wood Coffee Table",
                        "Royal Oak Engineered Wood Coffee Table",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "10200",
                        "12",
                        "7000",
                        "0",
                        "https://www.artmeta.fr/wp-content/uploads/2020/03/ARTMETA-table-ronde-nageoire-acier-et-bois-massif-1-768x720.jpg",
                        "table_6"));

        productMap.put("Tables", productlist);

        productlist = new ArrayList<Product>();

        // Chair
        productlist
                .add(new Product(
                        "Bean Bag Chair Cover",
                        "The Denia wooden folding chair set is made from naturally hardwearing acacia hardwood which suits any style of garden.",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://www.godrejinterio.com/imagestore/B2C/DINCHR016/DINCHR016_A1_803x602.jpg",
                        "chair_1"));

        productlist
                .add(new Product(
                        "Bean Bag Chair Cover",
                        "The Denia wooden folding chair set is made from naturally hardwearing acacia hardwood which suits any style of garden.",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://www.godrejinterio.com/imagestore/B2C/DINCHR016/DINCHR016_01_1500x1500.png",
                        "chair_2"));

        productlist
                .add(new Product(
                        "Bean Bag Chair Cover",
                        "The Denia wooden folding chair set is made from naturally hardwearing acacia hardwood which suits any style of garden.",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://www.godrejinterio.com/imagestore/B2C/DINCHR030/DINCHR030_01_500x500.png",
                        "chair_3"));

        productlist
                .add(new Product(
                        "Wood Restaurant Chairs Comparison Chart",
                        "The Denia wooden folding chair set is made from naturally hardwearing acacia hardwood which suits any style of garden.",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://www.trentfurniture.co.uk/images/products/category_images/57.jpg",
                        "chair_4"));

        productlist
                .add(new Product(
                        "Wood Restaurant Chairs Comparison Chart",
                        " The Denia wooden folding chair set is made from naturally hardwearing acacia hardwood which suits any style of garden.",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://www.restaurantfurnituresupply.com/images/restaurant-chairs-comparison.jpg",
                        "chair_5"));

        productlist
                .add(new Product(
                        "Wood Restaurant Chairs Comparison Chart",
                        "Unlike other manufacturers, our chairs are shipped fully assembled and ready for use, saving you the need to spend extra time on assembly.\n",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://www.cielo.co.za/62962-home_default/stella-dining-chair.jpg",
                        "chair_6"));

        productlist
                .add(new Product(
                        "Wood Restaurant Chairs Comparison Chart",
                        "Unlike other manufacturers, our chairs are shipped fully assembled and ready for use, saving you the need to spend extra time on assembly.\n",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://www.cielo.co.za/35257-big_default/riley-dining-chair.jpg",
                        "chair_7"));

        productlist
                .add(new Product(
                        "Wood Restaurant Chairs Comparison Chart",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://www.theone.com/images/thumbs/0017377_rebo-dining-chair-beigenatural_870.jpeg",
                        "chair_8"));

        productlist
                .add(new Product(
                        "Wood Restaurant Chairs Comparison Chart",
                        "ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
                        "With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
                        "36500",
                        "20",
                        "1200",
                        "0",
                        "https://cdn.shopify.com/s/files/1/1718/2455/products/chairs-kennedy-globe-occasional-chair-15510638329901_800x.jpg?v=1611116751",
                        "chair_9"));

        productMap.put("Chairs", productlist);

        productlist = new ArrayList<Product>();

        // Chair
        productlist
                .add(new Product(
                        "Brown Metal Steel Almirah, For Home",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://5.imimg.com/data5/VV/ZB/YH/SELLER-454454/steel-almirah-500x500.jpg",
                        "almirah_1"));

        productlist
                .add(new Product(
                        "Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://5.imimg.com/data5/SELLER/Default/2020/10/GO/WK/QT/3788379/godrej-steel-almirah-designs-with-price-double-door-metal-wardrobe-home-furniture-250x250.jpg",
                        "almirah_2"));

        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://www.godrejinterio.com/imagestore/B2C/30161803SD00218/30161803SD00218_A1_803x602.jpg",
                        "almirah_3"));

        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://www.malikfurniture.pk/wp-content/uploads/2020/10/Almirah-122.jpg",
                        "almirah_4"));

        productlist
                .add(new Product(
                        "l Collapsible Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://www.malikfurniture.pk/wp-content/uploads/2020/10/Almirah-122.jpg",
                        "almirah_5"));

        productlist
                .add(new Product(
                        "Metal Free Standing Wardrobe",
                        "Everything Imported Carbon Steel Collapsible Wardrobe",
                        "Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
                        "2999",
                        "20",
                        "1999",
                        "0",
                        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLpMNsluYJXkTEOx8Cq49V2RulVGfyBFOenQ&usqp=CAU",
                        "almirah_6"));

        productMap.put("Almirah", productlist);

        productMap.put("Almirah", productlist);

        CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

    }

    public void getAllProducts(int productCategory) {

        if (productCategory == 0) {

            getAllElectronics();
        } else {

            getAllFurnitures();

        }

    }

}
