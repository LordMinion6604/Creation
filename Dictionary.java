class Dictionary {
    public Record Records[];
    public int size;
    public int length;
    public double get(int k){
        for(int i = 0;i < length;i++){
            if(Records[i].key == k){
                return Records[i].value;
            }
        }
        return 0;
    }
    public Record put(Record record){
        for(int i = 0;i < length;i++){
            if(Records[i].key == record.key){
                return record;
            }
        }
        Records[length] = record;
        return null;
    }
    public Record remove(int k){
        for(int i = 0;i < length;i++){
            if(Records[i].key == k){
                Record temp = Records[i];
                for(int j = i;j < length -1;j++){
                    Records[i] = Records[i+1];
                }
                return  temp;
            }
        }
        return null;
    }
}
