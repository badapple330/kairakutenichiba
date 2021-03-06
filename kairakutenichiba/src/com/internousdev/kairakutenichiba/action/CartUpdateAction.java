package com.internousdev.kairakutenichiba.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.kairakutenichiba.dao.CartUpdateDAO;
import com.internousdev.kairakutenichiba.dao.GoCartDAO;
import com.internousdev.kairakutenichiba.dao.ItemStocksDAO;
import com.internousdev.kairakutenichiba.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * カート内の個数を増減するクラス
 * @author
 * @since
 * @version
 */

public class CartUpdateAction extends ActionSupport implements SessionAware {

    /**
     * シリアルID
     */
    private static final long serialVersionUID = -869165581865322731L;
    /**
     * カートID
     */
    private int cartId;
    /**
     *ユーザーID
     */
    private int userId;
    /**
     *商品ID
     */
    private int itemId;
    /**
     *商品名
     */
    private String itemName;
    /**
     * 価格
     */
    private int price;
    /**
     *更新前の購入数
     */
    private int prevQuantities;
    /**
     *更新後の購入数
     */
    private int quantities;
    /**
     *イメージファイルパス
     */
    private String imgPath;
    /**
     *購入商品の合計価格
     */
    private int amountAll;
    /**
     * 更新処理をした件数
     */
    private int updateCount;
    /**
     *カート情報
     */
    private ArrayList<CartDTO> cartList;
    
    /**
     *セッション情報
     */
    private Map<String, Object> session;
    
    /**
     * カートの数量を更新するメソッド
     * @author　shoji hayato
     * @since 17/09/25
     * @version 1.0
     */

     /**
     * 実行メソッド 処理内容と順番 
     * 1：ログインしているかを確認
     * 2：購入数が在庫数を超えていないか判断
     * 3：カートからその商品のデータを削除
     * 4：カートの情報を取得
     */
    public String execute() {
        String result = ERROR;
            if (session.containsKey("userId")) {
            userId = (int) session.get("userId");
        System.out.println("ユーザーIDは？"+userId);
        System.out.println("アイテムIDは？"+itemId);
        System.out.println("数量は？"+quantities);
            ItemStocksDAO stocksdao=new ItemStocksDAO();
            if(quantities>stocksdao.stocks(itemId)){
            	result="other";
            }else{
            	CartUpdateDAO updatedao=new CartUpdateDAO();
            	if(updatedao.update(userId, itemId, quantities)>0){
            		result=SUCCESS;
            	}
            }
            
            GoCartDAO cartdao= new GoCartDAO();
            cartList=cartdao.selectedItem(userId);
            for(int i=0;i<cartList.size();i++){
            	amountAll += (cartList.get(i).getPriceyen()*cartList.get(i).getQuantities());
            }
            }
            return result;
    }
    /**
     * カートIDを取得するメソッド
     * @return cartId カートID
     */
    public int getCartId() {
        return cartId;
    }

    /**
     * カートIDを格納するメソッド
     * @param cartId セットする cartId
     */
    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    /**
     * ユーザーIDを取得するメソッド
     * @return userId　ユーザーID
     */
    public int getUserId() {
        return userId;
    }

    /**
     * ユーザーIDを格納するメソッド
     * @param userId セットする userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * 商品IDを取得するメソッド
     * @return itemId　商品ID
     */
    public int getItemId() {
        return itemId;
    }

    /**
     * 商品IDを格納するメソッド
     * @param itemId セットする itemId
     */
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    /**
     * 商品名を取得するメソッド
     * @return itemsName　商品名
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * 商品名を格納するメソッド
     * @param itemName セットする itemName
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * 価格を取得するメソッド
     * @return price 価格
     */
    public int getPrice() {
        return price;
    }

    /**
     * 価格を格納するメソッド
     * @param price セットする price
     */
    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * 更新前の購入数を取得するメソッド
     * @return prevQuantities　更新前の購入数
     */
    public int getPrevQuantities() {
        return prevQuantities;
    }
    /**
     * 更新前の購入数を格納するメソッド
     * @param prevQuantities セットする prevQuantities
     */
    public void setPrevQuantities(int prevQuantities) {
        this.prevQuantities = prevQuantities;
    }

    /**
     * 更新後の購入数を取得するメソッド
     * @return quantities　更新後の購入数
     */
    public int getQuantities() {
        return quantities;
    }

    /**
     * 更新後の購入数を格納するメソッド
     * @param quantities セットする quantities
     */
    public void setQuantities(int quantities) {
        this.quantities = quantities;
    }

    /**
     * イメージファイルパスを取得するメソッド
     * @return imgPath　イメージファイルパス
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * イメージファイルパスを格納するメソッド
     * @param imgPath セットする imgPath
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    /**
     * 合計金額を取得するメソッド
     * @return amountAll　合計金額
     */
    public int getAmountAll() {
        return amountAll;
    }

    /**
     * 合計金額を格納するメソッド
     * @param amountAll セットする amountAll
     */
    public void setAmountAll(int amountAll) {
        this.amountAll = amountAll;
    }

    /**
     * 更新処理をした件数を取得するメソッド
     * @return updateCount　更新処理をした件数
     */
    public int getUpdateCount() {
        return updateCount;
    }

    /**
     * 更新処理をした件数を格納するメソッド
     * @param updateCount セットする updateCount
     */
    public void setUpdateCount(int updateCount) {
        this.updateCount = updateCount;
    }

    /**
     * カート情報を取得するメソッド
     * @return cartList　カート情報
     */
    public ArrayList<CartDTO> getCartList() {
        return cartList;
    }

    /**
     * カート情報を格納するメソッド
     * @param cartList セットする cartList
     */
    public void setCartList(ArrayList<CartDTO> cartList) {
        this.cartList = cartList;
    }

  
    /**
     * セッション情報を取得するメソッド
     * @return session　セッション情報
     */
    public Map<String, Object> getSession() {
        return session;
    }

    /**
     * セッション情報を格納するメソッド
     * @param session セットする session
     */
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

}