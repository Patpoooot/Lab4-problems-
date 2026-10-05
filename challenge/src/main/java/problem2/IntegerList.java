package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int count; //number of elements in the list 
    int size; //the size of the list

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        this.size = size;
        this.count = 0;
    }
    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    //increasing the size of the array
    public void increaseSize() {
        size *= 2;

        int[] newList = new int[size];

        for (int i=0; i<count; i++) {
            newList[i] = list[i];
        }

        list = newList;
        count++;
    }

    //adding new elements to the list, cheking if it is full or not
    public void addElement(int newVal) {
        if (count == size) increaseSize();
        list[count] = newVal;
    }

    //removing the first occurrence of the given value
    public void removeFirst(int newVal) {
        int idx = -1;

        for (int i = 0; i < count; i++) {
            if (list[i] == newVal) {
                idx = i;
                break;
            }
        }

        if (idx == -1)
            return;

        for (int i = idx; i < count - 1; i++) {
            list[i] = list[i + 1];
        }

        count--;
    }

    //removing all occurrences of the given value
    public void removeAll(int newVal) {
        int original = count;
        for(int i=0; i<count; i++) {
            removeFirst(newVal);
            if(original == count) break;
            else original = count;
        }
    }
}