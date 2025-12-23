void main() {

    var value1 = 6;
    var binary1 = Integer.toBinaryString(value1);
    System.out.printf("First operation number %s (binary representation %s) \n", value1, binary1);
    var value2 = 5;
    var binary2 = Integer.toBinaryString(value2);
    System.out.printf("Second operation number %s (binary representation %s) \n", value2, binary2);
    var result = value1 | value2;
    var binaryResult = Integer.toBinaryString(result);
    System.out.printf("Binary Representation: %s\n", binaryResult);
    System.out.printf("%s | %s = %s\n", value1, value2, value1 | value2);
}
