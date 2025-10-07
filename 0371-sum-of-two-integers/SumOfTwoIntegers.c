int add(int a, int b){
    uint32_t au = (uint32_t)a;
    uint32_t bu = (uint32_t)b;
    while(bu != 0u){
        uint32_t carry = (au & bu) << 1;
        au = au^bu;
        bu = carry;
    }
    return (int)au;
}

int getSum(int a, int b) {
    return add(a, b);      
}
