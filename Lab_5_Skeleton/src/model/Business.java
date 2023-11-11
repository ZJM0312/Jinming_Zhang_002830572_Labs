/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zhangjinming
 */
public class Business {
    MasterOrderList masterOrderList;
    SupplierDirectory supplierDiresctory;
    
    public Business(){
    masterOrderList = new MasterOrderList();
    supplierDiresctory  = new SupplierDirectory();
}

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(MasterOrderList masterOrderList) {
        this.masterOrderList = masterOrderList;
    }

    public SupplierDirectory getSupplierDiresctory() {
        return supplierDiresctory;
    }

    public void setSupplierDiresctory(SupplierDirectory supplierDiresctory) {
        this.supplierDiresctory = supplierDiresctory;
    }
    
    
}
