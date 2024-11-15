public class Node {
    private long id; // 节点ID
    private double latitude; // 纬度
    private double longitude; // 经度

    // 构造函数
    public Node(long id, double latitude, double longitude) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // 获取节点ID的方法
    public long getId() {
        return id;
    }

    // 获取纬度的方法
    public double getLatitude() {
        return latitude;
    }

    // 获取经度的方法
    public double getLongitude() {
        return longitude;
    }

    // 重写toString方法，方便调试
    @Override
    public String toString() {
        return "Node{id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + "}";
    }

    // 可以根据需要添加其他方法，例如比较、哈希等
}