package Bai9.z;

public class CongNhan {	
    private String maCN;
    private String mHo;
    private String mTen;
    private int mSoSP;

    public CongNhan() {
    }

    public CongNhan(String maCN, String mHo, String mTen, int mSoSP) {
        this.maCN = maCN;
        this.mHo = mHo;
        this.mTen = mTen;
        setMSoSP(mSoSP);
    }

    public String getMaCN() {
        return maCN;
    }

    public void setMaCN(String maCN) {
        this.maCN = maCN;
    }

    public String getMHo() {
        return mHo;
    }

    public void setMHo(String mHo) {
        this.mHo = mHo;
    }

    public String getMTen() {
        return mTen;
    }

    public void setMTen(String mTen) {
        this.mTen = mTen;
    }

    public int getMSoSP() {
        return mSoSP;
    }

    public void setMSoSP(int mSoSP) {
        if (mSoSP > 0) {
            this.mSoSP = mSoSP;
        }
    }

    public double tinhLuong() {
        if (mSoSP <= 199) {
            return mSoSP * 0.5;
        } else if (mSoSP <= 399) {
            return 199 * 0.5 + (mSoSP - 199) * 0.55;
        } else if (mSoSP <= 599) {
            return 199 * 0.5 + 200 * 0.55 + (mSoSP - 399) * 0.6;
        } else {
            return 199 * 0.5 + 200 * 0.55 + 200 * 0.6 + (mSoSP - 599) * 0.65;
        }
    }

    @Override
    public String toString() {
        return String.format("Ma CN: %s | Ho ten: %s %s | So SP: %d | Luong: %.2f", 
                             maCN, mHo, mTen, mSoSP, tinhLuong());
    }
}