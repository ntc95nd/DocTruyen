package com.ntc.doctruyen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.ntc.doctruyen.doctruyen.R;

import java.util.ArrayList;

/**
 * Created by Administrator on 07/08/2016.
 */
public class DocTruyen extends Activity{
    ArrayList<String> arrChuong;
    TextView txtNoiDung;
    TextView txtPage;
    ImageButton imgButtonBack, imgButtonNext;
    int c = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doc_truyen);

        Intent intent = getIntent();
        int sttTruyen = intent.getIntExtra("truyen",-1);
        switch (sttTruyen){
            case 0 :
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.anoan_c1)));
                arrChuong.add(new String(getResources().getString(R.string.anoan_c2)));
                arrChuong.add(new String(getResources().getString(R.string.anoan_c3)));
                break;
            case 1:
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.bahangxom_c1)));
                arrChuong.add(new String(getResources().getString(R.string.bahangxom_c2)));
                arrChuong.add(new String(getResources().getString(R.string.bahangxom_c3)));
                break;
            case 2 :
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.baynguoilaibuon)));
                arrChuong.add(new String(getResources().getString(R.string.end)));

                   break;
            case 3:
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.cannhakho_c1)));
                arrChuong.add(new String(getResources().getString(R.string.cannhakho_c2)));
                arrChuong.add(new String(getResources().getString(R.string.cannhakho_c3)));
                arrChuong.add(new String(getResources().getString(R.string.cannhakho_c4)));
                arrChuong.add(new String(getResources().getString(R.string.cannhakho_c5)));
                arrChuong.add(new String(getResources().getString(R.string.cannhakho_c6)));
                arrChuong.add(new String(getResources().getString(R.string.cannhakho_c7)));
                arrChuong.add(cannhakho_c8);
                arrChuong.add(new String(getResources().getString(R.string.cannhakho_c9)));
                arrChuong.add(new String(getResources().getString(R.string.cannhakho_c10)));
                arrChuong.add(new String(getResources().getString(R.string.cannhakho_c11)));
                arrChuong.add(new String(getResources().getString(R.string.cannhakho_c12)));



                break;
            case 4:
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.caytrucma_c1)));
                arrChuong.add(caytrucma_c2);
                arrChuong.add(new String(getResources().getString(R.string.caytrucma_c3)));

                break;
            case 5:
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.chuyennhangoai_c1)));
                arrChuong.add(new String(getResources().getString(R.string.chuyennhangoai_c2)));
                arrChuong.add(new String(getResources().getString(R.string.chuyennhangoai_c3)));
                arrChuong.add(new String(getResources().getString(R.string.chuyennhangoai_c4)));
                arrChuong.add(new String(getResources().getString(R.string.chuyennhangoai_c5)));
                arrChuong.add(new String(getResources().getString(R.string.chuyennhangoai_c6)));

                break;
            case 6:
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.songnuoc_c1)));
                arrChuong.add(new String(getResources().getString(R.string.songnuoc_c2)));
                arrChuong.add(new String(getResources().getString(R.string.songnuoc_c3)));
                arrChuong.add(new String(getResources().getString(R.string.songnuoc_c4)));
                arrChuong.add(new String(getResources().getString(R.string.songnuoc_c5)));
                arrChuong.add(new String(getResources().getString(R.string.songnuoc_c6)));
                arrChuong.add(new String(getResources().getString(R.string.songnuoc_c7)));
                arrChuong.add(new String(getResources().getString(R.string.songnuoc_c8)));
                arrChuong.add(new String(getResources().getString(R.string.songnuoc_c9)));
                arrChuong.add(new String(getResources().getString(R.string.songnuoc_c10)));
                arrChuong.add(new String(getResources().getString(R.string.songnuoc_c11)));
                arrChuong.add(new String(getResources().getString(R.string.songnuoc_c12)));

                break;
            case 7:
                arrChuong = new ArrayList<>();
                arrChuong.add(congtorong_c1);
                arrChuong.add(new String(getResources().getString(R.string.congtorong_c2)));

                break;
            case 8:
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c1)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c2)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c3)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c4)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c5)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c6)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c7)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c8)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c9)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c10)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c11)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c12)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c13)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c14)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c15)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c16)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c17)));
                arrChuong.add(new String(getResources().getString(R.string.datdoc_c18)));
                break;
            case 9:
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c1)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c2)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c3)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c4)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c5)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c6)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c7)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c8)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c9)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c10)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c11)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c12)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c13)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c14)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c15)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c16)));
                arrChuong.add(duyenam_c17);
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c18)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c19)));
                arrChuong.add(new String(getResources().getString(R.string.duyenam_c20)));


                break;
            case 10:
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.letruta_c1)));
                arrChuong.add(new String(getResources().getString(R.string.letruta_c2)));
                arrChuong.add(new String(getResources().getString(R.string.letruta_c3)));
                arrChuong.add(new String(getResources().getString(R.string.letruta_c4)));
                arrChuong.add(new String(getResources().getString(R.string.letruta_c5)));
                arrChuong.add(new String(getResources().getString(R.string.letruta_c6)));
                arrChuong.add(new String(getResources().getString(R.string.letruta_c7)));
                arrChuong.add(new String(getResources().getString(R.string.letruta_c8)));
                break;
            case 11:
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.ngamngai_c1)));
                arrChuong.add(new String(getResources().getString(R.string.ngamngai_c2)));
                break;
            case 12:
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.ngoinhatrongdem_c1)));
                arrChuong.add(new String(getResources().getString(R.string.ngoinhatrongdem_c2)));
                arrChuong.add(new String(getResources().getString(R.string.ngoinhatrongdem_c3)));
                arrChuong.add(new String(getResources().getString(R.string.ngoinhatrongdem_c4)));
                arrChuong.add(new String(getResources().getString(R.string.ngoinhatrongdem_c5)));
                arrChuong.add(new String(getResources().getString(R.string.ngoinhatrongdem_c6)));
                arrChuong.add(new String(getResources().getString(R.string.ngoinhatrongdem_c7)));
                arrChuong.add(new String(getResources().getString(R.string.ngoinhatrongdem_c8)));
                break;
            case 13:
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.khantrang_c1)));
                arrChuong.add(new String(getResources().getString(R.string.khantrang_c2)));
                arrChuong.add(new String(getResources().getString(R.string.khantrang_c3)));
                arrChuong.add(new String(getResources().getString(R.string.khantrang_c4)));
                arrChuong.add(new String(getResources().getString(R.string.khantrang_c5)));
                arrChuong.add(new String(getResources().getString(R.string.khantrang_c6)));

                break;
            case 14:
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.oanhon_c1)));
                arrChuong.add(new String(getResources().getString(R.string.oanhon_c2)));
                arrChuong.add(new String(getResources().getString(R.string.oanhon_c3)));
                arrChuong.add(new String(getResources().getString(R.string.oanhon_c4)));
                arrChuong.add(new String(getResources().getString(R.string.oanhon_c5)));
                arrChuong.add(new String(getResources().getString(R.string.oanhon_c6)));
                arrChuong.add(new String(getResources().getString(R.string.oanhon_c7)));
                arrChuong.add(new String(getResources().getString(R.string.oanhon_c8)));
                arrChuong.add(new String(getResources().getString(R.string.oanhon_c9)));
                arrChuong.add(new String(getResources().getString(R.string.oanhon_c10)));
                arrChuong.add(new String(getResources().getString(R.string.oanhon_c11)));
                arrChuong.add(new String(getResources().getString(R.string.oanhon_c12)));
                arrChuong.add(new String(getResources().getString(R.string.oanhon_c13)));
                arrChuong.add(new String(getResources().getString(R.string.oanhon_c14)));
                arrChuong.add(new String(getResources().getString(R.string.oanhon_c15)));
                break;
            case 15:
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.quengoai_c1)));
                arrChuong.add(new String(getResources().getString(R.string.quengoai_c2)));
                arrChuong.add(new String(getResources().getString(R.string.quengoai_c3)));
                arrChuong.add(new String(getResources().getString(R.string.quengoai_c4)));
                arrChuong.add(new String(getResources().getString(R.string.quengoai_c5)));
                arrChuong.add(new String(getResources().getString(R.string.quengoai_c6)));
                arrChuong.add(new String(getResources().getString(R.string.quengoai_c7)));
                arrChuong.add(new String(getResources().getString(R.string.quengoai_c8)));
                arrChuong.add(new String(getResources().getString(R.string.quengoai_c9)));
                arrChuong.add(new String(getResources().getString(R.string.quengoai_c10)));
                break;
            case 16:
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.vongam_c1)));
                arrChuong.add(new String(getResources().getString(R.string.vongam_c2)));
                arrChuong.add(new String(getResources().getString(R.string.vongam_c3)));
                arrChuong.add(new String(getResources().getString(R.string.vongam_c4)));
                arrChuong.add(new String(getResources().getString(R.string.vongam_c5)));
                arrChuong.add(new String(getResources().getString(R.string.vongam_c6)));
                arrChuong.add(new String(getResources().getString(R.string.vongam_c7)));
                arrChuong.add(new String(getResources().getString(R.string.vongam_c8)));
                arrChuong.add(new String(getResources().getString(R.string.vongam_c9)));
                arrChuong.add(new String(getResources().getString(R.string.vongam_c10)));
                arrChuong.add(new String(getResources().getString(R.string.vongam_c11)));
                arrChuong.add(new String(getResources().getString(R.string.vongam_c12)));

                break;
            case 17:
                arrChuong = new ArrayList<>();
                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c1)));
                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c2)));
//                arrChuong.add(xomcovong_c2);

                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c3)));
                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c4)));
                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c5)));
                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c6)));
                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c7)));
                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c8)));
                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c9)));
                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c10)));
                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c11)));
                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c12)));
                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c13)));
                arrChuong.add(new String( getResources().getString(R.string.xomcovong_c14)));
                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c15)));
                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c16)));
                arrChuong.add(new String(getResources().getString(R.string.xomcovong_c17)));
                break;
            case 18:

                break;
            case 19:

                break;
            case 20:

                break;




            default:
                break;

        }

        txtNoiDung = (TextView) findViewById(R.id.txt_noi_dung);
        txtPage = (TextView) findViewById(R.id.txt_page);
        imgButtonNext = (ImageButton) findViewById(R.id.btn_next);
        imgButtonBack = (ImageButton) findViewById(R.id.btn_back);
        txtPage.setText("1");
        imgButtonBack.setVisibility(View.INVISIBLE);
        txtNoiDung.setText(arrChuong.get(c));
        imgButtonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c++;
                imgButtonBack.setVisibility(View.VISIBLE);
                if (c<arrChuong.size()){
                    txtNoiDung.setText(arrChuong.get(c));
                    txtPage.setText(Integer.toString(c+1)+"/"+arrChuong.size());
                }
                if (c == arrChuong.size()-1)
                    imgButtonNext.setVisibility(View.INVISIBLE);
            }
        });
        imgButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c--;
                imgButtonNext.setVisibility(View.VISIBLE);
                if (c>=0){
                    txtNoiDung.setText(arrChuong.get(c));
                    txtPage.setText(Integer.toString(c+1)+"/"+arrChuong.size());
                }
                if (c==0)
                    imgButtonBack.setVisibility(View.INVISIBLE);
            }
        });

    }




    String xomcovong_c2="Xin lỗi các bác vì sự chậm trễ này, nhưng quả thật sự tò mò của con người là không có giới hạn, cũng vì chuyện của em or chị or cô or bà Cầm này mà em vừa được triệu tập khẩn cấp ra cổng trường công nghiệp để giải trình vs Mr MaBư Gầy và anh em, sau khi em mách cho con lô thì cũng không tò mò nữa, mà đã tha cho em tất nhiên con lô mà em nhắc không hoàn toàn chính xác, nhưng cũng phải có đến 73% là tru g\n" +
            "ợt\n" +
            "có phải muốn là gặp dc nó đâu vs cả khả năng xin lô đề chắc chỉ 2 tay bạch thủ chiều hôm khét tiếng phòng bên làm được, ngay cả vs em nó cũng là bí mật… thôi review luôn\n" +
            "Mấy hôm nay hôm nào em cũng thiếu ngủ.\n" +
            "Sáng nay đến cty trong lại trong bộ dạng ấy mắt lờ đờ, em vừa mở máy vào voz check thớt thì bị sếp cho ăn hành: “thằng kia, sáng nay mày ăn cái éo gì mà mặt cứ ngu ngu thế, lên tầng 5 vác bình nước xuống đây ”, mặt nghệt như tây dẫm phải cứt chó, sáng giờ đã được cái vẹo gì vào mồm đâu, mà đéo hiểu sao tự dưng ông xỉ vả mình nữa. Ngẫm lại chắc là vì hôm qua ông mới nhắc mà hôm nay đã lỡ quên cmn sinh nhật ổng,sau đấy nhớ ra e rủ thằng mới vào 2 thằng đi mua ngay cái bánh gato vs ít thịt chó về cải thiện tình cảm vs sếp, về cái thay đổi thái độ ngay,cầm đĩa thịt chó vs bó hoa lại cười te tởn anh anh vs chú chú như đúng rồi, trưa nay làm bữa ếu biết phải nói là cỗ ngọt hay cỗ mặt nữa, đời thủa nào khai vị bằng bánh gato ăn chính bằng thịt chó vs gà rán xong tráng miệng ít hoa quả vs kem caramen, bữa nay con Cầm nó không hành em thì chắc Tào Tháo cũng rượt em tới bến …\n" +
            "à mà xin lỗi các thím nếu cái giọng văn tạp pín lù của em làm các thím ngộ độc nhưng thôi thông cảm em nhá, nó phọt ra thế nào thì e ghi lại thế đó thôi\n" +
            "Từ sáng giờ em cũng quay cuồng trong muôn vàn câu hỏi kiểu như\n" +
            "“Thế lúc thím qwerty em nó có biết không ”\n" +
            "….. có một sự thốn nhẹ, vì thím hỏi e mới để ý….cơ mà nó trẻ con mà\n" +
            "“thím review chi tiết 1 chút về cái khoản nhan sắc của em nó dc ko Tóc tai, màu da, mặt mũi, quần áo, giầy dép ”\n" +
            "cho mình thông bạn cái được không, toàn gặp bất ngờ ko xón ra quần là may rồi còn để ý được chi tiết nữa thì em thánh cmnr. Các bác gặp ma thì đa số lúc đấy đều cảm thấy hơi lờ đờ ngai ngái, tai ù ù không nghe thấy gì khác giống như có ai đấy lấy 2 bàn tay ép chặt 2 bên tai các bác ấy chỉ nghe thấy nó thôi, các bác thử đi cái này nó giống kiểu ma bịt tai hay mà che mắt ấy, nó chỉ cho mình nghe và thấy những gì nó muốn. Thằng bạn cùng phòng e ở thị trấn Vôi, Bắc Giang nhà nó gần đường tàu kể chỗ nó nhiều người chết vì bị tàu đâu rất dị vì đi bộ qua đấy mà tàu kéo còi từ xa cả trăm mét vẫn ko biết gì,em cúng éo tin nhưng nó thề sống thề chết là chính nó cũng một lần buổi trưa đi chơi nó đứng ngẩn tò te giữa đường tàu lúc tàu đi qua, may có ông chú gần đấy ôm nó chạy ra ko thì giờ hết thằng chia từng cốc rượu sẻ từng can dầu đùa thôi ngoài thi thoảng nhậu nhẹt vs dota thì bọn em trong sáng và cực kỳ đứng đắt trừ lúc tìm được bản kav jav vav Full HD\n" +
            "Lan man tí nhưng nếu đúng là con Cầm nó nghịch thì... thánh họ nhà nó, chìa khóa em để trên giường lật qua lật lại có đúng cái gối mấy lần éo thấy, ngồi một lúc quay ra tự nhiên lại thấy. Tóm lại là cái gì nhìn ko rõ chứ nét mặt nó vs cái bộ áo xô cháo lòng như mặc mấy tháng ko giặt thì không bao giờ em quên được\n" +
            "“Rồi lại có thím hỏi sao em thấy nó và nói chuyện với nó như thế nào”\n" +
            "Cái đoạn review lúc 2h sáng của em có lẽ hợp với câu hỏi này em xin dc nguyên văn nó :\n" +
            "“Em cũng éo biết sao lại thấy nó nữa cũng liều hỏi nó sao chỉ chú thấy cháu thì nó bảo hợp tuổi vs cả nó thích chơi vs người có ngọc chẩm (cái này là cái u sương đằng sau đầu đối diện vs chẩm trước trán, mà theo em dc biết thì đây là cái tướng quý ngìn người có 1, bắt nguồn từ sự tích ông bao chẩn- bao thanh thiên cái tướng này được người khác quý nhưng khó giàu dân gian gọi lái đi là ngọc chẩm) mà em cũng éo hiểu cái tướng đấy thì liên quan gì đến ma mãnh, vía em cũng ko phải vía yếu vì chưa thấy con nào khác. Mà con này nói chuyện giọng trẻ con ngày xưa tọc tọc kiểu gì ấy hâm nữa, chắc rơi xuống giếng đập đầu vào thành cũng nên. Mà các thím nghĩ nói chuyện thành tiếng à, có lúc nói mở mồm mà có lúc mồm không mở cũng nghe thấy kiểu như tiếng lòng ấy, các bác cứ tưởng tượng nhiều lúc buổi trưa đi một mình cảm giác có người bước sau lưng gọi tên mình xong quay lại ko thấy ai ấy, ma đấy mỗi cái ban ngày ồn ko nghe thấy thôi, tầm 3h sáng là chuẩn nhất theo phật giáo là lúc âm khí vượng nhất mà thiên chúa nghe đâu cái mốc 3h sáng cũng là giờ của quỷ, các bác có bao giờ thấy mình tỉnh giấc xem đồng hồ thấy đúng 3h ko có thì cẩn thận nhé... đậu xanh rau má, đang viết thấy có mùi nhang, giờ mới 2h17 am, có biến, chắc lại 2 thằng phòng bên ra xin lô con Cầm đi mấy hôm nay rồi đã về éo đâu, thôi kệ cha 2 thằng ml gọi nó cho lắm, mai nó hất cho ko còn cái bát nào mà ăn cơm, cơ mà :( hóng 2 thằng kia xin lô con này ko bao giờ hiện luôn,thôi em đi ngủ mai làm sớm ”\n" +
            "\n" +
            "Các bác tò mò cũng đúng thôi, muốn check thì cứ âm thầm mà check chứ tùm lum lên thì sẽ thế nào ….? E nghĩ quan trọng là các bác có 1 cái nhìn đúng về sự việc này và tự ngẫm sẽ làm gì nếu gặp, khuyên dc thì tốt ko thi cũng không sao chứ đúng đúng sai sai gì cứ tên tuổi địa chỉ địa ngụ rồi confirm cũng ko muộn người dương đi lâu chứ ng âm đi nhanh lắm, vs bắn e ít tiền sắm nhang là dc dạo này e kẹt vs cả bó nhang mốc hôm trc e đốt cả rồi và con vong Cầm dạo này phởn hay đòi linh tinh … … e đùa đấy đừng ném gạch em… thấy khó tin hay đứng đắn quá thì cứ coi như em viết các bác đọc vui vậy nhé\n" +
            "Tiếp…\n" +
            "Đến sáng nay mới biết cái mùi nồng nồng thơm thơm lúc 2h sáng hôm qua không phải 2 thằng phòng bên đốt nhang, mà là lọ sơn màu gụ nó để cửa sổ bị rơi đổ sạch, mà thế éo nào em lại ngửi thành mùi nhang mới đểu chứ. Tầm qua 3h sáng tí cái máy bơm nước lên bể lọc(bể cát) tự bật , vì cái máy bơm nó để ngay cửa sổ phòng em aptomat bật nó kêu U..u..uuu vừa chợp mắt dc tí e lại mò dậy, tại nghĩ có thằng ml nào đấy bật máy bơm giờ này tính xông ra chửi dkm tiên sư tiền sử thằng ngu nào bật máy không để cho bố ngủ, cửa phòng thằng nào thằng nấy đóng kín mít chốt cửa trong, lúc đấy e ko nghĩ gì đến con bé dưới giếng, chỉ đang thiếu ngủ hậm hực tắt áp đi ngủ tiếp. Cũng nói thêm là khu em ở chưa có nước sạch, tháng đóng 60k tiền nước mà là nước giếng khoan lọc qua bể cát than hoạt tính, tử tế như xóm em thì có thêm cái bể lắng rồi bơm lên là dùng tắm rửa vệ sinh thôi. Tuy là cũng gần sông, hạ lưu sông Hồng đấy nhưng không hiểu sao nước ngầm khu này phải lấy ở rất sâu, hôm ngồi xem xóm bên khoan giếng ông chủ trọ bảo hồi xưa nhà ông trong làng cũng có cái giếng khơi sâu đến cả hơn chục m, rơi bồ múc nước xuống đó thì cứ tập xác định là lấy cây tre vầu ngoắng cũng ko thấy. Như vậy thì cái giếng lấp này cũng phải xâu không kém, mà em éo hiểu con này bị lấp xâu thế mà cũng lên được @@ chả có nhẽ nó giống con Samara Morgan trong phim The Ring bác nào xem rồi chắc biết. Em cũng nghi nghi cái giếng khoan xóm em vì đúng góc đấy đúng tọa độ mà cứ thằng ml nào dựng xe vào đấy là y như rằng đêm nó quấy, hồi đầu đến trọ nghe chủ trọ nịnh bảo cái giếng này nước sạch lắm phải khoan qua đá cả chục mét mới lấy nước, ở đây khoan tầm 10m là thấy đá rồi, ậm ờ cho qua dù gì mình tắm thôi chứ có ăn uống éo đâu mà đòi hỏi nhiều vs cả truyền thống cmnr không ghẻ không có thẻ sinh viên mà , em cũng không biết có đá gì nằm ở cái độ sâu chục mét ko nhưng em biết ở cái độ sâu đấy có con Cầm... có khi mấy bố khoan giếng hỳ hục dập, dập vào nó cũng nên, nghĩ vớ vẩn em tự dưng sợ value rồi, cơ mà nó hiền mà, mỗi tội hâm hâm thôi. Còn cái nước hàng ngày e tắm thôi kệ nếu phải thật em tắm Cầm thì cũng tắm 2 năm nay rồi vs cả khoan cả mấy chục m cơ mà.\n" +
            "Lại chuyện cái aptomat, em để ý nhiều lần rồi cứ tầm 2 3 h sáng nó lại bật, thằng khác bật thì ko sao, ap tự tắt vì chập cháy ko sao, đây là tự bật thì chỉ có thể là con choi con này làm.Thấy nó vui tính em cũng kệ,…. chứ thật ra em làm éo gì được nó mà chả kệ. Em cứ ngủ chết mê chết mệt đến 7h20 thì chuông điện thoại kêu, mắt nhắm mắt mở phi ra ngoài đánh răng rửa mặt đi làm, vừa mở cửa em giật cmn mình vì cái sân lênh láng máu chảy từ trong bể cát chảy ra tận cổng, định thần lại thì ếu phải máy bơm mở từ đêm qua đến sáng nước nó dềnh lên tràn vào cái hộp sơn màu gụ đổ tối qua loang loáng chộn vs màu sắt trong nước giếng khoan tạo ra cái màu kinh… kinh éo thể tả dc . Cũng không rõ là trùng hợp hay con Cầm làm nhưng trong lòng em đang có 1 chút hoang mang nhẹ…\n" +
            "Có biến e sẽ update tiếp";

    String duyenam_c17="Vậy là từ những buổi học sau tôi có vẻ ít chơi với Hoa hơn và ít chơi với tất cả những đứa con gái cùng lớp mà chơi thân với bọn con trai cùng lớp có cùng đam mê mới là game “Võ lâm truyền kì 2”. Thế là suốt kì hai tôi chỉ lo đến lớp là bàn luận chuyện võ lâm đại sự. Mặc dù có vẻ mê game nhưng tôi không hề hư hỏng như một số đứa khác, tôi không bao giờ lừa dối gia đình một xu để lấy tiền chơi game hoặc làm mấy việc bất hợp pháp để kiếm tiền để chơi game. Tôi chơi game có thời gian quy định chứ không hề nghiện ngập nhưng cũng đủ làm tôi chểnh mảng việc học rồi vì tôi cũng sớm đầu hàng số phận biết mình không thể thi đỗ nổi Đại học. \n" +
            "\n" +
            "Vì vậy tôi chỉ lo đủ tốt nghiệp cái cấp 3 là ok rồi, biết tôi có vẻ thay đổi tiêu cực mấy đứa con gái cùng tổ cũng hay khuyên bảo nhưng tôi lại cứ đùa cợt không bao giờ nói chuyện nghiêm túc về vấn đề đó. Thỉnh thoảng Hoa hoặc Diệp có nói chuyện bảo tôi là nên bỏ game đi chứ mê mấy trò này chả ai thích. Lúc này thì tôi cần ai thích chứ thế là được thể tôi nhăn nhở trêu lại:\n" +
            "- Em bảo anh bỏ rượu , anh bỏ rượu.\n" +
            "- Em bảo anh bỏ thuốc, anh bỏ thuốc.\n" +
            "- Em bảo anh bỏ game, anh bỏ em. \n" +
            "\n" +
            "\n" +
            "Vậy là mấy em ấy cũng chán khi nói chuyện khuyên bảo với kẻ ngang như cua. Tôi chả quan tâm. Vậy là nửa năm cuối cấp trôi qua nhanh chóng không có biến động gì chỉ có một ấn tượng duy nhất là một vụ tôi bị em Hà cùng lớp chơi khăm một vố làm đến giờ tôi vẫn còn nhớ nhân tiện tôi share ra xem có bạn nào cùng cảnh ngộ không rồi end chap cấp 3 luôn.\n" +
            "\n" +
            "Buổi trưa hôm ấy giờ tan học trời cũng nắng khá to cái xe đạp của tôi thế nào lại giở chứng hỏng giữa đường phải để lại quán sửa xe vì trưa muộn ông chủ quán bảo để xe lại sửa sa, thế là tôi đành lững thững ra đường xem còn ai cùng đường để đi nhờ xe về, hôm nay tôi lại còn ra muộn nữa chứ bọn bạn về trước hết sạch chỉ còn lác đác vài đứa không quen đang về. Đang tuyệt vọng thì thầy Hà đi một mình tôi mừng rỡ gọi to:\n" +
            "- Ê taxi !!!\n" +
            "- Ơ! Sao muộn thế này mà còn đứng đường vẫy khách hả bạn – Hà đá đểu tôi.\n" +
            "- Hỏng xe nàng ạ. Cho tớ đi nhờ với nhé.\n" +
            "- Ừ ! Không vấn đề gì, chở tớ nhé, đang mệt có osin cũng tối – Hà nhe răng ra cười \n" +
            "- Chả lẽ để tiểu thư chở rồi lại sinh lắm chuyện – Tôi hậm hực trèo lên xe.\n" +
            "\n" +
            "Các thím có thể tham khảo chap Cấp 3 (2) để biết thêm về Hà và nhân tiện tôi cũng nói sơ qua về con bé này. Hà thuộc vào hàng ít nói trong lớp nhưng không có nghĩa là không biết bỡn cợt, nhan sắc thì cũng khá có đôi môi gợi cảm nhất lớp và con bé này điệu lắm cơ. Vì Hà ngồi khác dãy với tôi trong lớp nên tôi vẫn ít tiếp xúc với Hà nên không biết gì thêm chỉ biết là 90% Hà chưa có người yêu. Tôi không dám chắc chắn 100% vì những đứa con gái ít nói này khó đoán lắm. Theo cảm nhận của tôi thì Hà cũng dễ gần không như tin đồn hồi cấp hai là Hà rất kiêu và không muốn nói chuyện với người lạ.\n" +
            "\n" +
            "Tôi vừa chở Hà vừa hỏi han tại lí do về muộn thì biết được hôm nay Hà có tạt qua nhà Dì ở gần trường có chút việc rồi về ngay. Nói chuyện linh tinh được một lát thì Hà bất chợt đề nghị :\n" +
            "- Này Dũng ! Cho tớ ôm cậu tí nhé,chả mấy khi có cơ hội “ăn mảnh” cùng nhau thế này.\n" +
            "\n" +
            "Tôi mừng hết chỗ nói vì tự nhiên có đứa nộp mạng thế này ngu gì từ chối không ngờ mình quyến rũ con gái đến thế. Nói là ôm nhưng Hà chỉ vòng tay qua eo chứ chả ôm sát vì kể ra trời cũng nóng bỏ mịa ra. Thỉnh thoảng tôi cố tình ngọ ngoậy chạm lưng vào ngực Hà thú vị ra phết. Vậy là tôi vẫn tiếp tục vừa chở Hà vừa tiếp tục nói chuyện nhưng lạ cái là hôm nay bọn trường khác đi ngược chiều cứ nhìn mình rồi cười đểu. Bố mấy thằng GATO vì không được chở gái đẹp nên gợi đòn đây mà, biết vậy tôi vênh mặt lên cười đểu  lại chúng nó cho bõ ghét. Nhưng mà con trai đã đành con gái nhìn thấy tôi bọn nó cứ che miệng cười tủm tỉm lạ vãi \n" +
            "\n" +
            "Trong lúc sướng con cu mù con mắt tôi cũng kệ mịa bọn nó chứ quan tâm gì trong lòng thầm rủa: “Bọn cá sấu chúa này chắc lại dính cúm H5N1 sinh thần kinh chăng” và tôi cứ thế bon bon đạp xe về đến lúc gặp một thằng lớp khác đi ngang qua nó thấy tôi liền đạp xe tới bảo:\n" +
            "- Mày bị làm sao thế con, chở gái mà phanh hết cúc áo ra khoe dao găm dọc đường mà không biết ngại à. Bệnh quá đấy...\n" +
            "\n" +
            "Lúc này tôi mới để ý xuống cái áo thì thấy mình đang phanh hết cúc ra thật, quay lại thì thấy con bé Hà này cười ngặt nghẽo chảy hết cả nước mắt nhìn cay vãi. Đúng là cái loại thâm nho nó lợi dụng sàm sỡ ôm tôi rồi lừa lừa cởi hết cúc áo tôi ra. Cũng dễ thôi vì trời nóng hai cái cúc trên cùng tôi phanh ra rồi nó còn vòng tay qua eo giữ cái áo làm nó không thể bay lung tung làm tôi phát hiện suốt chặng đường khá dài này. Mặt mũi tôi đỏ bừng vì ngại còn Hà thì cứ vừa cười vừa đóng cúc áo lại phụ tôi rồi tiếp tục đi về, dọc đường nó vẫn cười khúc khích ngứa máu vãi. May cho nó là hôm nay tôi đi nhờ xe nó chứ nó mà đi nhờ xe tôi thì tôi cho xuống đi bộ rồi.\n" +
            "\n" +
            "Lúc đến ngã rẽ về hai làng tôi bảo Hà về kẻo muộn còn tôi tự đi bộ về cũng được. Hà đồng ý vì cũng khá muộn, lúc này vào buổi trưa mà cái ngã ba này thuộc cánh đồng lúa nên khá vắng vẻ nên tôi quyết định troll lại Hà cho bõ ghét. Thế là lúc vừa chống xe lấy cái cặp ở giỏ xe ra tôi vồ lấy Hà đè dí vào gốc cây cạnh đó và hôn tới tấp vào khắp mặt. Hà hét ầm lên như bị hấp diêm. Hình như trong lúc ấy tôi có bóp vếu Hà nữa. Được một lát tôi bỏ ra cười đểu bảo:\n" +
            "- Có đi có lại chứ, làm tớ thành kẻ bệnh hoạn trong mắt bao nhiêu người, chả lẽ có tiếng lại không có miếng. Thôi bye nhé tớ về đây.\n" +
            "\n" +
            "Hà mặt đỏ bừng không nói gì lặng lẽ lấy xe đạp về. Kể ra lúc ấy tôi cũng bạo thật, có lẽ dây thần kinh xấu hổ bị đứt ngay từ khi phát hiện ra mình bị chơi khăm một cách thảm hại. Tôi ra về trong lòng hả hê ra phết và cũng chẳng để tâm đến cảm giác của Hà sau đó thế nào, chỉ biết là hôm liên hoan chia tay lớp cấp 3 Hà ôm tôi khóc mất gần hai tiếng, bọn khác ý kiến thì Hà bảo cơ hội để ôm trai miễn phí thì tội gì. Báo hại tôi buồn đi tiểu mà phải cố nhịn sợ mất lịch sự, có lẽ em này thèm mùi tôi cũng nên.\n" +
            "\n" +
            "Chia tay lớp cấp 3 tôi chẳng giữ liên lạc với tất cả nữa rồi có sự tư vấn của người nhà tôi lên Hà Nội thi Đại học để lấy điểm vào học Cao đẳng, trong thời gian ôn thi Đại học tôi đi chơi và không thèm nhìn đến sách vở.\n";
    String caytrucma_c2 = "Mọi người vào đọc cười xem như 1 chuyện giải trí rồi đi ra cũng ko sao cũng giống em lúc trước đọc chuyện ma vậy\n" +
            "Câu chuyện của em chưa đến hồi kết, mới chỉ là bắt đầu, em viết ra chỉ mong có ai đó tin mình và chia sẻ cùng mình\n" +
            "Bởi vì hiện tại đến nhà của mình emi còn ko rám về và ông anh cùng cơ quan đang cho em ở nhờ cũng ko hề hay biết về chuyện này\n" +
            "Mọi người đã đi ngủ nên em lấy đt ra viết tiếp cho mọi người cùng hiểu.\n" +
            "\n" +
            "Ko biết mọi người nghĩ ra sao chứ từ trước đến này em luôn nghĩ chiếu trúc thì toàn nhập ở tàu về...\n" +
            "Khi châm lửa đốt những miếng chiếu nhỏ em cũng lẩm bẩm khấn adi đà phật adi đà phật...\n" +
            "Giống như 1 cách trấn an tinh thân cho mình, ngọn lửa ko cháy dc to vì tôi sợ bà chủ nhà biết sẽ quát mình vì vậy nhìn nó cứ chập chờn xanh đỏ nhìn cũng đủ ghê rù là giữa trưa, thú thật là lúc đó em cũng chùn lắm rồi.\n" +
            "Muốn chuyển đi nhưng trót đặt cọc 3 tháng và có muốn đi cũng chưa tìm dc phòng. Đốt xong em gọi ngay cho ông bác bên nhà ngoại và kể sơ qua tình hình đêm hôm trước.\n" +
            "\n" +
            "Nói về nhà ngoại thì mẹ em có 10 anh chị em ( ngày xưa các cụ đẻ nhiều ) trong đó có 3 bác làm thầy bói và lập điện. Nhưng em ko tin 2 bác kia lắm. Chỉ có 1 bác ở Bắc Giang là nổi tiểng, ngày trước ông ở Hà Nội nhưng theo vợ 2 lên Bắc Giang sống, nghe đâu bảo trên đó dc cô dc cậu phù trợ. Qua điện thoại bác bảo xem thì thấy tháng này em có hoạ sát thân phải cẩn thận, có thể thằng đó chết giờ trùng nên mới có lá bùa ở cửa. Ông còn rặn 3 ngày nữa ông mang về cho 1 lá bùa bình an, đi đứng cản thận, cháu cao số và có quý nhân phù trợ nên rù là oan hồn cũng ko hại dc đâu.\n" +
            "\n" +
            "Nghe thế em cũng an tâm phần nào....\n" +
            "Đêm đến em đi ngủ rất sớm, phần vì hôm qua thức trắng đêm nên mệt phần vì sợ...\n" +
            "Ngủ mơ màng dc đến khảng 1h-1h30' thì em cứ nghe thấy tiếng mèo kêu trên mái nhà và tiếng móng nó cào xuống nghe soạt soạt rất khó chịu, mà cũng lạ nhà bà chủ nuôi 4 con chó đêm nào cũng sủa loạn lên khi có ai phóng xe máy qua hoặc có thằng đi chơi đêm về đứng đái bậy. Vậy mà đêm nay ko thấy con nào ư ư rù chỉ 1 tiếng, thay vào đó là tiếng mèo kêu, thật sự lúc đấy em hãi vãi đái ra. Vì nghĩ chẳng lẽ hồn thằng chó đó lại về, mà mình trả nó cái chiếu rồi còn đầu???.\n" +
            "\n" +
            "Nghĩ 1 lúc em lấy cái cán chổi đập mạnh lên trên mái xốp thì tiếng mèo cào biến mất, nhưng thay vào đó nó lại kêu, tiếng kêu nghe như tiếng trẻ con khóc, nó giống hệt tiếng đêm qua em nghe thấy. Vì bản thân em cũng cứng vía nên bực mình em vơ cái vượt muỗi bật đèn lên mở cửa, quyết tâm xem mặt mũi nó ra làm sao. Khi bước ra khỏi phòng đập thẳng vào mắt em là hình ảnh 3 cặp mắt xanh lè đang nhìn chằm chằm vào mình, và điều làm em sợ nhất đó là chúng đứng ở đúng nơi em đã đốt cái chiếu lúc trưa...........\n" +
            "\n" +
            "Tay quơi vội cái công tác đèn ở tường, em run run quay lại nhìn.....thì 3 con mèo chết tiệt đã biến mất. Em vào nhà bật hết những gì chạy dc rồi mở mắt đến khi trời sáng. Từ chỗ em đi đến công ty cũng chỉ vài km nhưng em luôn cẩn thận mũ mã rất đầy đủ và đi đứng chậm dãi. Sáng ra lấy dắt xe đi mà người nặng như chì hai mắt sưng tím vì mất ngủ, định đến cơ quan viết đơn xin nghỉ rồi về, em quyết định phải tìm hiểu cho rõ mình đang gặp phải chuyện gì?.?\n" +
            "\n" +
            "đường đến cơ quan đa phần là ngõ lên em ko thể nào phóng nhanh dc, chỉ có 1 đoạn cách cơ quan 1 cây là đường rộng rãi và rất nhiều taxi đỗ, đang đi và đầu óc nghĩ miên man bỗng em nghe ở trong đầu có 1 giọng trẻ con nói thì thầm tiếng gì đó mà chưa thể hiểu dc, Đó là điều cuối cùng em nhớ trước khi tỉnh dậy thấy mình bị khâu 5 mũi ở miệng và toàn thân xước sát. Theo thằng taxi kể lại thì nó đang đỗ ở ven đường bỗng em ở dưới vít ga lên rồi tông thẳng từ đuôi xe đến đầu xe nó, đâm tan 1 cái gương và em phải đền mất 2tr ( Đúng ra nó định bắt đền hơn nhưng vì đường đó ko dc đỗ xe), lúc đó có nhiều người cùng cơ quan đi làm nên họ nhận ra và đưa em vào viện, mọi người hỏi thì em chỉ nói do ốm nên bị ngất đâm vào đó.\n" +
            "\n" +
            "Ngay lập tức em đt cho bác và nhờ ông đừng nói gì vs bố mẹ em cả. Ko muốn để các cụ phải lo nên em nghĩ mình sẽ tìm hiểu mọi chuyện này 1 mình. Đến khoảng 12h trưa thì bác cũng đến và đưa em về nhà bác, vì bị thương toàn phần mềm nên cũng ko có gì ái ngại lắm. Sau khi gieo quẻ bằng bài tây thì bác bảo em đang bị 3 cái tinh nó theo và trả thù, ông nói do ngày xưa búi trúc làm chiếc chiếu đó mọc trên phần mộ của 3 cái vong chết oan nên chúng đã theo nhập vào cây trúc và giờ em đốt chiếc chiếu đi chúng mất nhà vì vậy nó ms tìm cách báo thù.\n" +
            "\n" +
            "Thật sự nếu ko phải chuyện này sảy ra vs chính bản thân em thì chắc có lẽ sẽ chẳng bao giờ em tin dc. Và em cũng ko hi vọng các bác sẽ tin. Nhưng em xin nhắc lại đó là những gì diễn ra vs cuộc đời của em và nó vẫn đang sảy ra. Bác nói cách tốt nhất là tìm dc phần mộ của 3 cái tinh đó và bốc lên xây dựng lại tử tế. Nhưng việc đó thì quá khó, vì vậy chỉ còn cách làm lễ cầu siêu cho chúng hoặc vào chùa nhờ các sư thầy. Mà cầu siêu thì bác em lượng sức mình ko thể làm dc.\n" +
            "\n" +
            "Chỉ còn cách lên chùa nhờ giúp. Bác cũng cho em 1 lá bùa hộ thân và bảo tốt nhất ko nên về nhà, vì nếu nó ko hại dc mình thì sẽ tìm cách hại người thân mình. Cũng vì vậy mà em ko rám kể cho ai nghe vì sợ họ xa lánh mình, sau hơn 1 tuần ở nhà bác với đôi môi sưng vều thì chủ nhật này em cũng phải đến chùa Hàm Long 1 chuyến, hi vọng ai quen nơi đó giúp đỡ .... Để em có thể gặp chụ trì. Em sẽ kể cho các bạn nghe sau khi e về.\n";

    String cannhakho_c8 ="Những hạt mưa lạnh buốt rơi lách tách xuống khắp khuôn mặt và cơ thề Nam làm Nam choàng tỉnh. Dáo dác nhìn xung quanh, Nam giật thót tim khi phát hiện ra mình đang nằm kế bên cánh cửa của căn nhà kho, gai óc Nam nổi cả lên: \"Trời đất ơi, tại sao mình lại nằm ở đây, rõ ràng khi nãy mình đang ở gần bếp kia mà\", tiếng mưa, tiếng gió rít lên từng cơn. Bất chợt Nam nhìn xuống dưới, một vệt dài kéo lê của sinh vật lúc nãy, bùn đất nhày nhụa cùng với nước mưa chảy loang lỗ,dưới khe của cánh cửa nhà kho, nước bùn chảy ra từng dòng nhỏ, ko dám nhìn thêm, Nam cố gắng dùng tất cả sức lực chạy hộc tốc vào nhà,chân luýnh quýnh đạp vào nhau. Nam tong cánh cửa nhà bếp ra, ko cần suy nghĩ thêm, Nam vội vàng lấy xe ra cửa, tay run rảy cầm ống khóa mà cứ trượt lên trượt xuống, khó khăn lắm Nam mới khóa xong cái cửa. Nhảy lên xe chạy như bay thẳng về nhà trong đêm mưa gió. Lúc ấy là 3h13''.\n" +
            "\n" +
            "Nam bàng hoàng, lo lắng, tim cứ đập liên tục, Nam chạy hối hã, những tưởng có ai đó rượt theo sau lưng, Nam cảm thấy đêm nay sao mà xa thế, gió và mưa cứ táp vào mặt, vào mắt làm Nam cay xè, người run lên bần bật vì lạnh và sợ. Xe đang chạy rất nhanh, bỗng từ đâu 1 con mèo chạy lướt ngang qua đường làm Nam lại một phen hú vía, Nam thắng gấp, do trời mưa đường xá ướt mẹp làm xe Nam trượt bánh té lăn quay trên đường đau điếng, vừa sợ vừa bực mình \"Đồ quỷ xứ\". Rất may là ko sao, chỉ bị trày nhẹ ở tay, Nam gượng đứng dậy,dựng xe lên phóng ga chạy tiếp một mạch về nhà.Vừa về đến trước cổng,Nam nhảy xuống xe chạy đến bên cửa,vừa nhấn chuông liên hồi,vừa đập cửa ầm ầm \"Mẹ ơi, mở cửa cho con....\", vài phút sau,ánh đèn bên trong nhà Nam bật sáng, tiếng cửa kiếng, cửa sắt mở ra, mẹ Nam nhìn ra ngoài, trong thấy Nam với bộ dạng ướt như chuột lột, người run rảy, vội vàng chạy ra cổng mở cửa cho Nam.\n" +
            "\n" +
            "\"Đi đâu trông đêm mưa gió vậy con.....?\", Nam ko kịp trả lời mẹ, đã chạy thẳng một mạch vào buồng tắm, dưới làn nước nóng của vòi sen, vậy mà sao Nam vẫn cảm thấy lạnh toát cả người, đầu óc cứ lẩn quẩn những hình ảnh lúc ban nãy, thật ko thể nào tin nổi nhưng nó đã diễn ra ngay trước mắt Nam như một cuốn phim chiếu chậm, thoáng rùng mình Nam lắc lắc đầu như cố sua đi những hình ảnh đó. Chợt Nam nghe tiếng mẹ vọng vào hỏi: \"Nam, con đi đâu vậy, người ướt nhẹp, sao ko mặc áo mưa vào, lỡ bệnh rồi sao con? Nam đáp lời mẹ: \"Ah,hồi chiều tối con đi qua nhà mấy thằng bạn nhậu, chắc là say quá nên con ngủ quên, sựt tỉnh dậy thì thấy khuya quá nên con chạy về, ai ngờ mưa to quá ko về nhà trọ kịp nên con chạy một mạch về đây lun chứ đâu có gì đâu, mẹ đừng lo\", nói đoạn Nam lau khô đầu tóc mình mẩy rồi bước lên lầu. Mẹ Nam với theo đưa cho Nam ly trà nóng :\"Uống cho ấm người đi con rồi đi ngủ\". Bước vào phòng mình Nam như thấy yên tâm hơn, hít một hơi thật sâu, mùi trà lài tỏa ra thơm ngát làm dịu cơ thể, hớp ngụm trà ấm cả người, tinh thần trở lại bình thường hơn, Nam bước lên giường đặt người xuống và ngủ, ko muốn nghĩ ngợi gì thêm vào lúc này nữa, có gì để tính sau, đã về đến nhà rồi nên bớt sợ đi nhiều, chắc do cơ thể quá mệt mỏi nên vừa nằm xuống Nam đã ngáy khò, ngoài trời mưa vẫn rơi.\n" +
            "\n" +
            "Buổi sáng Nam thức dậy,cảm giác khi được ở nhà thật bình yên,suy nghĩ về những gì xảy ra đêm hôm qua như 1 giấc mơ mà đến giờ này Nam vẫn ko tài nào hiểu nổi, Nam nghĩ ko biết có nên nói chuyện này cho Sanh hay là Hùng biết ko nữa, mà nếu nói ra chắc gì đã tin. Mà thôi, suy nghĩ nhiều cũng thế, đợi Hùng lên rồi giải quyết sau vậy, nghĩ thế nên Nam bước xuống nhà ăn sáng, cả ngày ko đi đâu hết. Sanh thấy lạ bèn đến bên anh mình hỏi: \"Ủa, hôm nay anh hai ko đi đâu sao? Bộ đêm qua có chuyện gì hả mà thấy anh về khuya quá...\", Nam đang nằm trên ghế xem phim,nghe Sanh hỏi Nam quay sang nói: \"Thì hôm qua tao đi nhậu nên về khuya..., với lại nhà trọ vắng người nên buồn về đây vài hôm đợi thằng Hùng lên\".\n" +
            "\n" +
            "Buồi chiều, Sanh chuẩn bị đi chơi với bạn gái, Sanh hỏi mượn Nam cái đĩa Windows về đề cài lại máy, Nam quăng chìa khóa nhà trọ cho Sanh. Tối đó, khi chở bạn gái về nhà xong, Sanh chạy đến nhà trọ của Nam để lấy cái đĩa,mở cửa bước vào nhà Sanh nhăn mặt, một mùi tanh tanh sộc vào mũi Sanh, Sanh bước vào trong, dưới nền đất vươn vãi những bệt bùn đất và nước,Sanh buột miệng: \"Cái quái gì vậy nè, cha nội này sao mà ở dơ vậy, dậm cả đất vào nhà, thiệt tình\", nói đoạn Sanh chạy đi tìm miếng giẻ lau sơ những vết bẩn ấy, mùi hôi tanh nồng thật khó chịu.\n";
    String congtorong_c1 ="Em xin kể lại một câu chuyện hoàn toàn có thật ở quê em, một câu chuyện đáng để biết và suy ngẫm về việc mạo phạm vào “đất long mạch” và “đất Phật”. Em kể câu chuyện này, đơn giản chỉ là muốn mọi người biết nhiều hơn, để tránh xúc phạm tới thế giới tâm linh. Ai không tin vào những câu chuyện mang tính kì bí thì có thể back ra bất cứ lúc nào, và cũng đừng nên cmt những điều báng bổ trong này. Bởi lẽ, câu chuyện dưới đây em kể lại, chính là một câu chuyện về hậu quả cho những hành động thiếu tôn trọng với thế giới tâm linh.\n" +
            "\n" +
            "Địa danh “Cống Tổ Rồng” trong câu chuyện dưới đây là hoàn toàn có thật. Nó thuộc xóm Đầu Cầu, Yên Mỹ - Lạng Giang. Đây cũng chính là quê mẹ của em, một nơi mà em chỉ được biết đến qua những lời kể của người lớn. Bởi lẽ từ những năm 97, em đã theo bố mẹ mình vào Nam sinh sống, thế nên kí ức của em về nơi ấy là hoàn toàn không có.\n" +
            "\n" +
            "Em xin miêu tả sơ qua để mọi người có thể hình dung được kết cấu của Cống Tổ Rồng: Quê em có một con sông nhỏ, quanh năm nước trong xanh như một con suối. Nó giao nhau với một con đường, bên cạnh lại là hàng ray xe lửa. Thế nên chỗ giao nhau tạo thành hình chữ thập đấy, người ta làm một cái cống bằng đá rất lớn và chắc chắn. Đó cũng chính là Cống Tổ Rồng…Còn cái tên ấy có từ bao giờ, và vì sao lại đặt là “Tổ Rồng” thì em hoàn toàn không biết.\n" +
            "\n" +
            "Cống Tổ Rồng giống như một nhà máy thủy điện. Nó giúp con đường ngăn dòng sông thành 2 bên khác nhau: bên phải con đường, nước dâng cao, xanh ngắt. Bên còn lại thì chảy ngầm dưới một cánh đồng dài cả km, rồi mới chảy ra thành sông. Để đảm bảo an toàn, không ai bị vướng hay chui vào trong cống, người ta tạo ra một cái lưới sắt ở bờ phải để bịt cống lại.\n" +
            "\n" +
            "Chỉ khi nước bên bờ phải của cống dâng quá cao, người ta mới xả cống cho nước chảy xuyên từ đầu này sang đầu kia…Em thì hoàn toàn không còn chút hình ảnh nào về nó, những điều biết được chỉ là do ba mẹ và các chị em kể lại. Nên miêu tả có gì sai sót, các bác ở Lạng Giang đọc được cũng đừng gạch đá em nhé.\n" +
            "\n" +
            "Làng em ngày ấy có một ngôi chùa từ thời bao cấp, nằm gọn trên một ngọn đồi. Ngoại trừ những ngày lễ ra, ít ai lên chùa cúng bái gì cả. Ngôi chùa khá đơn sơ, đa phần là được xây bằng đất, chỉ có vài chỗ là được làm bằng gỗ thôi. Gần giống như một ngôi miếu vậy.\n" +
            "\n" +
            "Tất cả những tượng Phật trong chùa đều được đắp bằng đất sét. Bên ngoài được phủ lớp sơn màu, vừa để đẹp, vừa tránh cho tượng bị rã. Những ngày thường, ngôi chùa thường vắng tanh. Lâu lâu mới có mấy đám trẻ con ở xóm dưới lên quậy phá, nghịch ngợm…Trong đó có đám của Giang [em xin sử dụng đúng tên thật. Năm Mô A Di Đà Phật, xin người quá cố bỏ qua cho con].\n" +
            "\n" +
            "Tuy chùa nhỏ, lại ở tút trên đỉnh đồi heo hút, thế nhưng mỗi dịp lễ tết, người làng em và những làng bên cạnh vẫn đổ về nườm nượp cúng bái, xin lộc, nhang khói nghi ngút. Bởi lẽ, ngôi chùa nổi tiếng là rất linh, nghe đâu còn nằm trên long mạch gì đấy…Thế nên, người lớn trong làng vẫn luôn miệng nhắc đám nhỏ: “tụi mày đi chăn trâu, có quậy phá gì thì quậy. Chớ có nói năng linh tinh, hỗn hào trên chùa!”\n" +
            "\n" +
            "Giang năm ấy chỉ tầm bằng tuổi mẹ em. Mới khoảng 12-13 gì đó… Trẻ con xóm nghèo thì suốt ngày tụm năm tụm ba với nhau, đa phần là đi quậy phá mọi người trong lúc chăn trâu rảnh rỗi. Mà cái giống chăn trâu nó nhàn lắm, cứ cột trâu ở đấy cho gặm cỏ, khi nào hết lại dông ra chỗ khác. Thế nên tụi trẻ con cứ tha hồ tụm lại mà quậy phá.\n" +
            "\n" +
            "Giang ngày ấy còn bé, cũng được bố mẹ giao cho con trâu đi chăn cùng chúng bạn. Đây cũng chính là khởi nguồn cho những trò nghịch dại của nó [xin thứ lỗi cho con vì dám gọi là “nó”, A Di Đà Phật…Xin được lượng thứ].\n" +
            "\n" +
            "Buổi chiều hôm ấy trời hiu hiu gió, Giang cùng tụi bạn dắt đám trâu lên đồi chơi rồi cột lũ trâu ở đảm cỏ chân đồi. Ngày hôm ấy có cả thằng em nó đi cùng…Cả đám dắt nhau lên đỉnh đồi, chỗ có ngôi chùa đất sét. Chúng thi nhau bày ra đủ trò, quậy phá đủ thứ. Nhưng sẽ chẳng có gì để nói, nếu như Giang không làm những điều dại dột.\n" +
            "\n" +
            "Thấy mấy thằng bạn cứ luôn miệng nhắc “đừng có nghịch linh tinh trong chùa”. Giang tỏ vẻ bực mình, rồi chỉ tay về phía tượng Bụt nói rất nhiều những từ vô lễ, cốt để chứng minh mình là đứa không biết sợ, và không tin Thần, Phật.\n" +
            "\n" +
            "Lũ bạn càng tỏ vẻ sợ sệt, e dè. Thì Giang và thằng em càng tỏ ra thích thú với những trò đùa lố của mình. Cuối cùng, nó chạy lại bẻ một ngón tay trên tượng Phật. Vì tượng được nặn bằng đất sét, nên một thằng nhóc 12 tuổi như Giang cũng dư sức bẻ gãy. Ngón tay trên tượng Phật lìa ra, rớt chỏng quẻo xuống đất.\n" +
            "\n" +
            "Lũ bạn thấy thế chạy xuống chân đồi, dong trâu đi chỗ khác chăn tiếp, không dám ở lại vì sợ phải tội với Phật. Sau lần ấy, nhóm của Giang không dắt trâu lên đồi nữa. Những tưởng sẽ không có gì xảy ra, thì vào một buổi chiều nọ, sau khi chăn trâu về. Cả đám rủ nhau ra Cống Tổ Rồng tắm, nước ở chỗ cống rất trong xanh, phía dưới lại có rêu tảo, nên lũ trẻ con rất thích tắm ở đấy.\n" +
            "\n" +
            "Đến tận xế chiều, cả lũ mới chịu lên bờ, mặc quần áo rồi đánh trâu về nhà. Những người trong nhóm sau này kể lại, chiều hôm đó trông Giang có vẻ rất lạ, cứ như là đang âu lo một điều gì đó. Dắt trâu về được một đoạn, Giang đưa trâu cho thằng em dắt về, rồi bảo quay lại tắm thêm chút nữa...\n" +
            "\n" +
            "Lũ bạn Giang cũng chỉ ngỡ là nó ham chơi, ráng ở lại tắm thêm một lúc cho đã, rồi mới về. Không ai ngờ rằng, đó cũng chính là những lời cuối cùng của Giang.\n" +
            "\n" +
            "Chiều tối hôm đó không thấy Giang về, nên cả nhà kéo nhau đi tìm. Mãi lúc sau, nghe thằng em Giang bảo nó ở lại tắm một mình, gia đình nó mới cùng với mấy thanh niên trong làng ra Cống Tổ Rồng tìm, quả thật tìm thấy quần áo Giang để lại trên bờ, còn nó thì không thấy đâu cả.\n" +
            "\n" +
            "Lúc đấy là tầm hơn 6h tối, Cống Tổ Rồng thì đang mở cho nước xả qua đầu bên kia. Biết có chuyện chẳng lành, vài thanh niên trong xóm mới chạy đi đóng dập nước lại, rồi thi nhau lặn xuống tìm xác Giang. Quả thật không sai, Giang bị kẹt trong chỗ xả nước…dòng nước khi Cống mở đã hút nó vào bên trong, kéo Giang dính chặt lưng vào trong cống.\n" +
            "\n" +
            "Xác Giang được vớt lên, trong bụng không có lấy một giọt nước nào giống như là bị chết đuối. Còn môi thì nát bét, đầy dấu răng. Có lẽ Giang đã cố gắng cắn chặt môi để không bị sặc nước vào bụng…\n" +
            "\n" +
            "Trong đám người đổ xô đi coi ngày hôm đó cũng có cả mẹ em. Mẹ em kể lại rằng xác Giang nằm đấy, trắng bệch, cứng đờ, nhưng không bị trào máu ra mắt, mũi và miệng như những người chết đuối khác…Phải một lúc sau, chị của Giang tới, thì máu trong mũi, miệng mới bắt đầu trào ra liên tục.\n" +
            "\n" +
            "Em trai của Giang, một thời gian sau cũng bỗng dưng bị tâm thần. Chả còn biết gì nữa, cứ đi lang thang hết chỗ này tới chỗ khác. Em không biết đó có phải là sự trùng hợp ngẫu nhiên hay không…nhưng những người trong làng em vẫn luôn cho rằng, hai anh em Giang gặp báo ứng vì đã xúc phạm tới Thần Phật.\n";
}
