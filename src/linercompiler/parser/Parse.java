package linercompiler.parser;

import linercompiler.stm.Stm;

/******************************
 *   date: 2013-1-17 下午02:43:43
 * author: qb.qian
 *****************************************/
public abstract class Parse {
    
    abstract Table  interpStm(Stm s,Table t);
}
