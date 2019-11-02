package cloud.prj.pc.wx.util;

import cloud.bos.action.AppAction;
import cloud.bos.dataproxy.DataUtil;
import cloud.bos.dataproxy.entity.UserEntity;
import cloud.bos.datasource.DataHelper;
import cloud.bos.entity.AFile;
import cloud.bos.entity.AResult;
import cloud.bos.entity.AValue;
import cloud.bos.fileproxy.FileProxy;

public class qrCodeTest {

    public static AResult numList(AppAction action) throws Exception {
        AResult result = new AResult();
        UserEntity user = action.getUser();
        System.out.println(action.getRequest().getParameter("id_user"));
        AValue id_user= DataHelper.Value(DataUtil.LoadTable("user",user),action.getRequest().getParameter("id"));
        StringBuffer sqlCtnDe=new StringBuffer();
        sqlCtnDe.append("select image from  pc_product where id=%s");
//        AFile file= FileProxy.OpenFile()
        AValue image= DataHelper.Value(DataUtil.LoadTable("product",user),sqlCtnDe.toString(),action.getRequest().getParameter("id"));


        // 存放在二维码中的内容
        String text = "票村测试";
        // 嵌入二维码的图片路径
        //可以根据需要分享的产品图片来生成相应的二维码图片C:/Users/Administrator/Desktop/工作/YCic5.jpg
        String imgPath = "";
        // 生成的二维码的路径及名称
        String destPath = "src/image/PC.jpg";
        //生成二维码
        QRCodeUtil.encode(text, imgPath, destPath, true);
        // 解析二维码
        String str = QRCodeUtil.decode(destPath);
        // 打印出解析出的内容
        System.out.println(str);

        return result;
    }


    }
