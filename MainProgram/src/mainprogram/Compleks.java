/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprogram;

/**
 *
 * @author user
 */
public class Compleks {
      Mahasiswa[] Dta;
    private int indx;
    private int x;
   
   
    Mahasiswa dt = new Mahasiswa();
    public Compleks(){
        Dta = new Mahasiswa[100];
    }
   
    public void get(int ind){
                System.out.println("NIM   : "+Dta[ind].getNim());
                System.out.println("Nama  : "+Dta[ind].getNama());
                System.out.println("IPK   : "+Dta[ind].getIpk());
                System.out.print("\n=====================\n");
                }
   
    public void set(int index, Mahasiswa datuk){
        Dta[index] = datuk;
    }

    public int getINDEX(){
        return indx;
    }
   
    public void setINDEX(int index){
        this.indx = index;
    }
  
    public void SearchNim(String nm){
        int a = getINDEX();
        for(int i = 0; i<a; i++){
            if(nm.equals(Dta[i].getNim())){
                get(i);
            }           
        }
    }
   
    public void SearchNama(String nm){
        int a = getINDEX();
        for(int i = 0; i<a; i++){
            if(nm.equals(Dta[i].getNama())){
                get(i);
            }           
        }
    }
   
    public void SearchIpk(String ip){
        int a = getINDEX();
        for(int i = 0; i<a; i++){
            if(ip.equals(Dta[i].getIpk())){
                get(i);
            }            
        }
    }
}

    

