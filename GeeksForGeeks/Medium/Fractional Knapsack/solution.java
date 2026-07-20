class Solution
{
    class Item
    {
        int value,weight;
        double ratio;
        Item(int value,int weight)
        {
            this.value=value;
            this.weight=weight;
            this.ratio=(double)value/weight;
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n=val.length;
        Item[] items=new Item[n];
        for(int i=0;i<n;i++)
        {
            items[i]=new Item(val[i],wt[i]);
        }
        Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));
        double maxi=0.0;
        for(int i=0;i<n;i++)
        {
            if(capacity==0)
            {
                break;
            }
            if(items[i].weight<=capacity)
            {
                maxi+=items[i].value;
                capacity-=items[i].weight;
            }
            else
            {
                maxi+=items[i].ratio*capacity;
                capacity=0;
            }
        }
        return Double.parseDouble(String.format("%.6f",maxi));
        
        
        // code here
        
    }
}

