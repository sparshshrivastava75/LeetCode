class leetRoman{
public int romanToInt(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    int len = s.length();
    int index = 0, result = 0;
    while (index < len) {
        Character chCur = s.charAt(index);
        Character chNext = null;
        if (index + 1 < len)
            chNext = s.charAt(index + 1);
        if(chNext != null && map.get(chCur) < map.get(chNext))
            result -= map.get(chCur);
        else
            result += map.get(chCur);
        index++;
    }
    return result;
}
}