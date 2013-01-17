package linercompiler.stm;

import linercompiler.exp.Exp;

/******************************
 * 赋值语句
 *****************************************/
public class AssignStm {
    public String id;
    public Exp exp;
    public AssignStm(String i,Exp e){
        id = i;exp=e;
    }
}
