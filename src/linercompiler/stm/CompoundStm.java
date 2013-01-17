package linercompiler.stm;


/******************************
 * 合成语句Stm-->Stm;Stm   (CompoundStm)
 *****************************************/
public class CompoundStm extends  Stm{
    
    public Stm stm1,stm2;
    
    /**********  construct          *************/
    public CompoundStm(Stm s1,Stm s2){
        stm1 = s1;
        stm2 = s2;
    }
    
    

}
