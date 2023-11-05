/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;


import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Rushabh
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    private ImageIcon logoImage;
    
    private ArrayList<Featrue> featrues;
    

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        featrues = new ArrayList<>();  // 在这里初始化features列表
        initFeatures();
    }

    /**
     * 添加共有属性
     * */
    private void initFeatures() {
        featrues.add(new Featrue("product name", "Type Value here"));
        featrues.add(new Featrue("brand", "Type Value here"));
        featrues.add(new Featrue("product number", "Type Value here"));
        featrues.add(new Featrue("size", "Type Value here"));
        featrues.add(new Featrue("weight", "Type Value here"));
        featrues.add(new Featrue("colour", "Type Value here"));
        featrues.add(new Featrue("price", "Type Value here"));
        featrues.add(new Featrue("material", "Type Value here"));
        featrues.add(new Featrue("discount", "Type Value here"));
        featrues.add(new Featrue("discount", "Type Value here"));
        featrues.add(new Featrue("discount", "Type Value here"));
        featrues.add(new Featrue("category", "Type Value here"));
        featrues.add(new Featrue("quality guarantee period", "Type Value here"));
        featrues.add(new Featrue("quality guarantee period", "Type Value here"));
        featrues.add(new Featrue("time to market", "Type Value here"));
    }

    public Featrue addNewFeature() {
        Featrue newFeature = new Featrue("New Feature", "Type Value here");
        featrues.add(newFeature);
        return newFeature;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Featrue> getFeatrues() {
        return featrues;
    }

    public void setFeatrues(ArrayList<Featrue> featrues) {
        this.featrues = featrues;
    }

    @Override
    public String toString() {
        return name;
    }

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    
    

}
