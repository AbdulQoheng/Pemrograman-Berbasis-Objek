package uts;

public class MainDataParent extends DataParent{
    
    protected MainDataParent(String[][] datamhs, String ljk[]){
       super(datamhs,ljk);
    }
    
    public static void main(String[] args) {
        
        String datamhs[][]= {
            {"P123", "C", " ", "A", "D", " "},
            {"P456", "D", "B", "B", " ", "C"},
            {"P789", "D", "E", "A", "B", "C"},
            {"P234", "D", "E", "D", "B", " "}
        };
        
        String ljk[] = {"D", "E", "A", "B", "C"};
       
        
        MainDataParent ob = new MainDataParent(datamhs,ljk);
        ob.tampil("Data Mahasiswa : ");
        ob.tampil(ob.getDatamhs());
        ob.tampil("Kunci jawaban : ");
        ob.tampil(ob.getLjk());
        ob.tampil("Pengkoreksian");
        ob.periksa(datamhs, ljk);
        ob.tampil(ob.getNilaimhs());
        ob.tampil("Nilai akhir");
        ob.setNilaiakhir(ob.getNilaimhs(), datamhs);
        ob.tampil(ob.getNilaiakhir());
        
        
        
        
        
        
        
    }
}
