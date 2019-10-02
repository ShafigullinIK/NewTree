public class MyTree {

    private Item root;

    public MyTree(){
        root = new Item(-1);
    }

    public void add(int number){
        add(root, number);
    }

    public void add(Item item, int number){
        if(number == -1){
            item.setEnd(true);

        } else {
            String s = number + "";
            int a = s.charAt(0) - 48;
            int result = -1;
            try{
                result = Integer.parseInt(s.substring(1));
            } catch (Exception e) {

            }
            Item[] connections = item.getConnections();
            if(connections[a] == null){
                Item newItem = new Item(a);
                item.addConnection(newItem);
                add(newItem, result);
            } else {
                add(connections[a], result);
            }
        }
        System.out.println("finish");
    }

}
