class Record{
    int key;
    double value;
    public Record(double value){
        this.value = value;
        if(Math.abs((int)(value*10)) - Math.abs((int)value*10)>=5)
            if(value >=0) this.key = (int)value + 1; 
            else this.key = (int)value - 1;
        else this.key = (int)value;    
    }
}