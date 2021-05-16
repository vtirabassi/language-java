package example.module.utils;

import example.module.utils.internals.SubHelper;
import example.module.utils.internals.SumHelper;

public class Calculadora {

    private SumHelper sumHelper;
    private SubHelper subHelper;

    public Calculadora() {
        sumHelper = new SumHelper();
        subHelper = new SubHelper();
    }

    public int sum(int a, int b){
        return sumHelper.execute(a, b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a, b);
    }

}
