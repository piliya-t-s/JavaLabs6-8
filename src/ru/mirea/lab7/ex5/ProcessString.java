package ru.mirea.lab7.ex5;

public class ProcessString implements IString {
    public static void main(String[] args) {
        ProcessString ps = new ProcessString();
        System.out.println(ps.getOddSymbols("Lorem Ipsum"));
        System.out.println(ps.countSymbols("Lorem Ipsum"));
        System.out.println(ps.getReverse("Lorem Ipsum"));
    }

    @Override
    public int countSymbols(String s) {
        return s.length();
    }

    @Override
    public String getOddSymbols(String s) {
        String newStr = "";
        for (int i=0; i<s.length(); i+=2){
            newStr = newStr + s.substring(i, i+1);
        }
        return newStr;
    }

    @Override
    public String getReverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
