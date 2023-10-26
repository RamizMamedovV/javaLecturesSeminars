package exceptions.Sem003.task3;

public class Counter implements AutoCloseable{

    private int count;
    private boolean isInit;

    public int getCount() {
        return count;
    }

    public Counter(int initNum) {
        count = initNum;
        isInit = true;
    }

    /**
     * Актуален только в случае отсутствия implements AutoCloseable
     * @return count++
     * @throws CloseCounterException  в случае isInit = false
     * , который выполняется в методе close()
     */
    public int add() throws CloseCounterException {
        if (!isInit)
            throw new CloseCounterException("closed");

        return count++;
    }


    @Override
    public void close(){
        isInit = false;
    }
}
