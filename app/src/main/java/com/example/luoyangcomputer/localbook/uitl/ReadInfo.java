package com.example.luoyangcomputer.localbook.uitl;

import java.util.ArrayList;
import java.util.List;

/**
 * package: com.example.luoyangcomputer.localbook.uitl
 * created by luoyang
 * QQ:1845313665
 * on 2018/10/29 1:37
 */
public class ReadInfo {
    public int nextParaIndex;            //即将读取的段落的索引
    public boolean isLastNext = true;           //上一次阅读是向后阅读还是向前阅读
    public boolean isNextRes;              //往后读是否剩余字符串
    public boolean isPreRes;                       //往前读是否剩余字符串
    public List<String> preResLines = new ArrayList<>();        //上一次向前读剩余的line
    public List<String> nextResLines = new ArrayList<>();       //上一次向后读剩余的line

}
