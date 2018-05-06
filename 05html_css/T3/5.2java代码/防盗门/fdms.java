
public class fdms implements gm,sm,ks,km{
    
 
    public String getgm() {
        // TODO Auto-generated method stub
        return "轻轻一推，门关上了";
    }

    public String getsm() {
        // TODO Auto-generated method stub
        return "插进钥匙，向左转钥匙三圈，门锁上了。";
    }
    @Override
    public String getks() {
        // TODO Auto-generated method stub
        return "插进钥匙，向右转钥匙三圈，锁开了。";
    }
    @Override
    public String getkm() {
        // TODO Auto-generated method stub
        return "用力推，门打开了。";
    }
}


