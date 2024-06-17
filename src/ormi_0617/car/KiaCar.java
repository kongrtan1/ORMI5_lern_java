package ormi_0617.car;

public class KiaCar implements Car{

    @Override
    public String showEngine() {
        return "이것은 기아엔진입니다.";
    }

    @Override
    public int amountNavi() {
        return 100000;
    }

    @Override
    public String getTier() {
        return "이것은 기아타이어입니다.";
    }
}

