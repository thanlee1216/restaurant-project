package restaurantDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RestaurantList {
	private static ArrayList<RestaurantInfo> arr;

	public RestaurantList() {
		if (arr == null) {
			Info();
		}

	}

	public List<RestaurantInfo> Info() {
		ArrayList<RestaurantInfo> arr = new ArrayList<RestaurantInfo>();

		arr.add(new RestaurantInfo("샤오바오우육면", "중식", "중화요리", "02-723-7788",
                "서울 종로구 관철동 12-24", "우육면, 마라탕면", "서울 종로구 삼일대로17길 15", "http://place.map.kakao.com/2053098478",
                "2053098478", "깔끔한", "https://mblogthumb-phinf.pstatic.net/MjAxOTAxMjdfMjg2/MDAxNTQ4NTc3NTE3ODA3.jyQh1Fb1ZaDOve3moocv4hNA1KRZZ5xqVtm6VKc72bAg.dv325fcLyIGnIgE_Va8Sn2RKWG2Omr6QgMN4n-4zcr4g.JPEG.tjgmlek86/20190123123624_IMG_2498-01-01.jpeg?type=w800"));

        arr.add(new RestaurantInfo("우육면관", "중식", "중화요리", "070-4213-5678",
                "서울 종로구 관철동 11-11", "우육면(특), 우육면", "서울 종로구 청계천로 75-2", "http://place.map.kakao.com/2143988257",
                "2143988257", "조용한", "https://img.siksinhot.com/place/1605152744017465.PNG?w=307&h=300&c=Y"));

        arr.add(new RestaurantInfo("갓덴스시", "일식", "초밥,롤", "02-730-1477",
                "서울 종로구 관철동 19-1", "점심 특선 초밥, 회전초밥", "서울 종로구 종로12길 14", "http://place.map.kakao.com/15204021",
                "15204021", "깔끔한", "https://media-cdn.tripadvisor.com/media/photo-s/12/05/3d/a2/caption.jpg"));

        arr.add(new RestaurantInfo("양연화로", "한식", "육류,고기", "02-3210-0808",
                "서울 종로구 관철동 13-5", "삼겹살, 특목살, 가브리살", "서울 종로구 삼일대로17길 18", "http://place.map.kakao.com/1619274444",
                "1619274444", "깔끔한", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTbDQhKh4uMunnB4EE5kH6Lu1OF4YpRJywpA&usqp=CAU"));

        arr.add(new RestaurantInfo("신도세기", "한식", "육류,고기", "02-739-8114",
                "서울 종로구 관철동 180", "SGP 통삽겹, SGP숄더랙", "서울 종로구 삼일대로17길 51", "http://place.map.kakao.com/811272424",
                "811272424", "조용한", "http://www.seoulwire.com/news/photo/201807/19120_14600_5630.jpg"));

        arr.add(new RestaurantInfo("롤링파스타", "양식", "이탈리안", "02-2261-5973",
                "서울 종로구 관철동 5-5", "크림 파스타, 화덕피자", "서울 종로구 삼일대로 392", "http://place.map.kakao.com/829236335",
                "829236335", "가성비좋은", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0w6gPHp_Q-I-qQf0zEulEOUmG5KK6zRmygzgNGx7aR-lHlLi_V1QNQsZtgW2MomVo3vk&usqp=CAU"));

        arr.add(new RestaurantInfo("종로돈부리", "일식", "돈부리", "02-722-2384",
                "서울 종로구 관철동 7-15", "가츠동, 믹스가츠동", "서울 종로구 삼일대로 385", "http://place.map.kakao.com/24725107",
                "24725107","깔끔한", "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/459460_1498928329342661.jpg"));

        arr.add(new RestaurantInfo("VIP참치", "일식", "참치회", "02-720-3888",
                "서울 종로구 관철동 11-13", "점심특선 참치 정식", "서울 종로구 삼일대로15길 25", "http://place.map.kakao.com/149543887",
                "149543887", "조용한", "https://ssproxy.ucloudbiz.olleh.com/v1/AUTH_e59809eb-bdc9-44d7-9d8f-2e7f0e47ba91/post_card/67041_1592286979_uZtHVD65.jpg"));

        arr.add(new RestaurantInfo("황소고집", "한식", "육류,고기", "02-722-5747",
                "서울 종로구 관철동 11-11", "고추장 불고기 백반", "서울 종로구 청계천로 75-1", "http://place.map.kakao.com/8696442",
                "8696442", "깔끔한", "https://img.siksinhot.com/place/1508728090055419.jpg"));

        arr.add(new RestaurantInfo("쟁반집8292", "한식", "육류,고기", "0507-1389-8384",
                "서울 종로구 관철동 43-13", "고기정식, 두루치기", "서울 종로구 종로8길 17", "http://place.map.kakao.com/735673283",
                "735673283", "가성비좋은", "https://mblogthumb-phinf.pstatic.net/MjAyMDA5MjNfMTYg/MDAxNjAwODMzNTI1NzIz.FBvpIkAm8uopIJL-kKCXt3Dg03RSBmurjJ2DEtXZxu8g.7Ugue12BSZdKVLD2X2K_OM7CypMwMHMGtn5A0Cf9Kb8g.JPEG.lin1210/IMG_9661.JPG?type=w800"));

        arr.add(new RestaurantInfo("숙달돼지", "한식", "육류,고기", "02-737-5201",
                "서울 종로구 관철동 43-15", "국내산 숙성 통삼겹, 부대찌개", "서울 종로구 종로8길 15", "http://place.map.kakao.com/650374759",
                "650374759", "가성비좋은", "https://cdn.imweb.me/thumbnail/20200513/480e99982a163.png"));

        arr.add(new RestaurantInfo("남대문막내회집", "한식", "해물생선회", "02-737-5115",
                "서울 종로구 관철동 263", "활어회", "서울 종로구 우정국로 4-1", "http://place.map.kakao.com/13272050",
                "13272050", "깔끔한", "https://mblogthumb-phinf.pstatic.net/20160601_249/bbi_yu_1464745684610p3cSv_PNG/tyle.io-CRpDviQwP8k8sZEJM-1_%2814%29.png?type=w800"));

        arr.add(new RestaurantInfo("종로불돼지", "한식", "육류고기", "02-734-1190",
                "서울 종로구 관철동 155", "간돼지, 불돼지", "서울 종로구 청계천로 67", "http://place.map.kakao.com/17278908",
                "17278908", "가성비 좋은", "https://www.chadorri.com/wp-content/uploads/2013/08/20130812_127.jpg"));

        arr.add(new RestaurantInfo("르브와", "양식", "이탈리안", "02-739-8208",
                "서울 종로구 관철동 19-11", "파스타, 리조또, 화덕피자", "서울 종로구 우정국로2길 42", "http://place.map.kakao.com/18283622",
                "18283622", "깔끔한", "https://media-cdn.tripadvisor.com/media/photo-s/1a/a9/94/45/caption.jpg"));

        arr.add(new RestaurantInfo("포탈라레스토랑", "한식", "인도음식", "02-318-0094",
                "서울 종로구 관철동 35-2", "카레, 스프, 국수", "서울 종로구 청계천로 99", "http://place.map.kakao.com/11834063",
                "11834063", "조용한", "https://modo-phinf.pstatic.net/20181201_136/1543648648445496se_JPEG/mosazRWPN5.jpeg?type=a1100"));

        arr.add(new RestaurantInfo("뚝배기집", "한식", "찌개전골", "02-2265-5744",
                "서울 종로구 관철동 5-1", "우렁된장, 된장찌개, 순두부", "서울 종로구 종로16길 12", "http://place.map.kakao.com/10374336",
                "10374336", "가성비 좋은", "https://mblogthumb-phinf.pstatic.net/MjAxODA1MjlfMjcy/MDAxNTI3NTUyOTA0MTA2.5-hNYc39kEPiiyJqd_yws_bXucW8eutfvf4sqQwzQa0g.3ZzwYW4hl4ysIGA0hbMQ9cOmCcm5NdGDWfaEdbue0lUg.JPEG.sherinks/20180527_185701.jpg?type=w800"));

        arr.add(new RestaurantInfo("더피자필", "양식", "피자", "02-795-3283",
                "서울 종로구 관철동 42-4", "마르게리따, 페페로니", "서울 종로구 종로10길 21", "http://place.map.kakao.com/1397192634",
                "1397192634", "조용한", "http://www.seoulwire.com/news/photo/201810/31169_25058_17.jpg"));

        arr.add(new RestaurantInfo("장수촌", "한식", "해물생선장어", "02-722-3149",
                "서울 종로구 관철동 7-5", "장어 구이, 바지락칼국수", "서울 종로구 삼일대로17길 8", "http://place.map.kakao.com/221545425",
                "221545425", "가성비좋은", "https://t1.daumcdn.net/cfile/tistory/994E93345BFF35F733"));

        arr.add(new RestaurantInfo("신촌황소곱창", "한식", "곱창막창", "02-735-6698",
                "서울 종로구 관철동 12-23", "황소곱창, 대창, 막창", "서울 종로구 삼일대로17길 17", "http://place.map.kakao.com/9631798",
                "9631798", "깔끔한", "https://mblogthumb-phinf.pstatic.net/MjAxNzExMTlfMTUg/MDAxNTExMDIwMjk0NDQ1.KM9dSD3E9Y3CT_Kjn1tdeRsDi-pQ4v89YPQYurjOaecg.uQf8IItml3XGLaB6HTJ-TvV5KKb66-ZTVSgWZGKEc6wg.JPEG.h00000n/IMG_5015.JPG?type=w800"));

        arr.add(new RestaurantInfo("반쿤콴", "한식", "태국음식", "02-725-1688",
                "서울 종로구 관철동 43-7", "태국식 쌀국수, 카오팟", "서울 종로구 종로10길 20", "http://place.map.kakao.com/208592301",
                "208592301", "조용한", "https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/20180219014039886_photo0_087b3dd4c395.jpg"));

        arr.add(new RestaurantInfo("미도갈비", "한식", "육류고기", "02-725-9233",
                "서울 종로구 관철동 11-13", "고베모듬, 오겹살", "서울 종로구 삼일대로15길 25", "http://place.map.kakao.com/1969790364",
                "1969790364", "가성비좋은", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcROHOQfJlJmOFXw1OAa8ucN8z1Zso_jbUTaEw&usqp=CAU"));

        arr.add(new RestaurantInfo("미친닭", "한식", "치킨", "02-722-9992",
                "서울 종로구 관철동 44-1", "미친통쌈닥, 순살콤보", "서울 종로구 우정국로2길 16", "http://place.map.kakao.com/26884480",
                "26884480", "가성비좋은", "https://mblogthumb-phinf.pstatic.net/MjAxNzA1MTZfMzIg/MDAxNDk0OTIzNTY5NDMz.NuPqvJEoe-JDJO3B1bvyfE-eCeGsWots9uXkLkeGJc4g.-sQLWWJiCzzFWtCGJCYFnwQeoKRc6ML3rgP5ohQwVR8g.JPEG.22woom/KakaoTalk_20170516_172037615%EC%A2%85%EB%A1%9C%EB%A7%9B%EC%A7%91%EC%A2%85%EB%A1%9C%EB%AF%B8%EC%B9%9C%EB%8B%AD_%EC%A2%85%EA%B0%81%EB%A7%9B%EC%A7%91%EC%A2%85%EA%B0%81%EC%97%AD%EB%A7%9B%EC%A7%91_%EC%A2%85%EB%A1%9C%EC%B9%98%ED%82%A8%EC%A7%91_%EC%A2%85.jpg?type=w800"));

        arr.add(new RestaurantInfo("원조우정낙지", "한식", "해물생선", "02-720-7991",
                "서울 종로구 관철동 19-16", "낚지볶음, 감자탕", "서울 종로구 삼일대로17길 46", "http://place.map.kakao.com/8458646",
                "8458646", "가성비좋은", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGfiQVRuEvdbUPddu28qWm4tCXql57VCcs7w&usqp=CAU"));

        arr.add(new RestaurantInfo("대찬횟집", "한식", "해물생선회", "02-738-8588",
                "서울 종로구 관철동 256", "모듬회, 활어회", "서울 종로구 우정국로2길 10", "http://place.map.kakao.com/27491757",
                "27491757","깔끔한", "https://t1.daumcdn.net/cfile/tistory/993DAF415E108D5C0A"));

        arr.add(new RestaurantInfo("교대이층집", "한식", "육류고기", "02-732-8188",
                "서울 종로구 관철동 14-1", "통삼겹, 통목살", "서울 종로구 삼일대로19길 16", "http://place.map.kakao.com/170372666",
                "170372666", "가성비좋은", "https://mp-seoul-image-production-s3.mangoplate.com/added_restaurants/707338_1492362614652656.jpg"));

        arr.add(new RestaurantInfo("일편등심", "한식", "육류고기", "070-4104-9922",
                "서울 종로구 관철동 180", "한우 눈꽃 등심, 안심", "서울 종로구 삼일대로17길 51", "http://place.map.kakao.com/916261841",
                "916261841", "깔끔한", "https://static.hubzum.zumst.com/hubzum/2020/11/12/09/06cfa004abc84093ab683f5ce7b5bd45.jpg"));

        arr.add(new RestaurantInfo("종로양꼬치", "중식", "양꼬치", "02-720-8168",
                "서울 종로구 관철동 13-7", "양모듬, 고급양갈비", "서울 종로구 삼일대로17길 20-2", "http://place.map.kakao.com/15864091",
                "15864091", "가성비좋은", "http://cdn.ksilbo.co.kr/news/photo/201904/691501_364918_269.jpg"));

        arr.add(new RestaurantInfo("당산오돌", "한식", "육류고기", "02-723-3590",
                "서울 종로구 관철동 44-5", "꼬들살, 눈꽃갈비", "서울 종로구 종로8길 20", "http://place.map.kakao.com/3678525",
                "3678525", "깔끔한", "https://emmaru.com/matzip/include/pics/2020/01/21/m_19852O213741_7.jpg"));

        arr.add(new RestaurantInfo("오로지라멘", "일식", "일본식라면", "02-733-9279",
                "서울 종로구 관철동 13-2", "돈코츠라멘, 오로지라멘", "서울 종로구 종로14길 16", "http://place.map.kakao.com/1414375847",
                "1414375847", "가성비좋은", "https://t1.daumcdn.net/cfile/tistory/99EF96375CE16DF009"));

        arr.add(new RestaurantInfo("왕비집", "한식", "육류고기", "02-720-3066",
                "서울 종로구 관철동 12-11", "소갈비정식, 불고기정식", "서울 종로구 삼일대로15길 24", "http://place.map.kakao.com/15232887",
                "15232887", "조용한", "https://media-cdn.tripadvisor.com/media/photo-s/07/ff/ac/d7/caption.jpg"));

        arr.add(new RestaurantInfo("고메식당", "한식", "육류고기", "02-723-0999",
                "서울 종로구 관철동 43-5", "돼지 꽃목살, 숙성 삼겹살", "서울 종로구 종로10길 14", "http://place.map.kakao.com/2131396403",
                "2131396403", "조용한", "https://mblogthumb-phinf.pstatic.net/MjAxNzA3MTdfMjA4/MDAxNTAwMjU4Mzk0OTE1.Zodr30xmueDpTJWHB8T6N_BYQdS4A_a8hCtDDvu_K0Qg.22FaJZp-zsGm1b4rj4J0MX9ZKqu9HZCVgcIOSoEmFKwg.JPEG.dieunjjang/image_955702301500258372498.jpg?type=w800"));

        arr.add(new RestaurantInfo("싱싱해물나라", "한식", "해물생선회", "02-733-1226",
                "서울 종로구 관철동 11-1", "활고등어회, 갈고회, 광고회", "서울 종로구 삼일대로15길 13", "http://place.map.kakao.com/7977978",
                "7977978", "가성비좋은", "https://s3-ap-northeast-1.amazonaws.com/dcreviewsresized/20211019104417_photo1_Nm0ULH5g8GOd.jpg"));

        arr.add(new RestaurantInfo("촌놈숯불닭갈비", "한식", "치킨", "02-722-3852",
                "서울 종로구 관철동 6-4", "닭목살구이, 허브숙성양념", "서울 종로구 삼일대로19길 6", "http://place.map.kakao.com/1750296031",
                "1750296031", "가성비좋은", "https://mblogthumb-phinf.pstatic.net/MjAxOTA5MjhfMjIg/MDAxNTY5Njc3NTM5MTcx.WZ4M7VVgCSN_cgnzFLwJKOVpmPLHVn0Z4yaSOFHKWvUg.3Xy8rKF71HPWDM2QP_vRUlGeCVSUq92otg4AIOVy-1Qg.JPEG.7533004/%EC%B4%8C%EB%86%88%EC%88%AF%EB%B6%88%EB%8B%AD%EA%B0%88%EB%B9%84.jpg?type=w800"));

        arr.add(new RestaurantInfo("차돌박힌쭈꾸미", "한식", "해물생선", "02-732-8806",
                "서울 종로구 관철동 175", "쭈꾸미 덮밥, 차쭈 세트", "서울 종로구 삼일대로17길 47-1", "http://place.map.kakao.com/26432860",
                "26432860","깔끔한", "https://mblogthumb-phinf.pstatic.net/MjAyMDAzMjRfMjAy/MDAxNTg1MDQ4NTEzNjEy.Ww2o2mUBjJzzvWV5k68NTNx3HXoUpN0e9dJ45nJpHLkg.vu4vF1hMhDENgJ6y8x5nUJeYFPzvCIc8MHUTn5vR5mYg.JPEG.noty9240/1585048513241.JPG?type=w800"));

        arr.add(new RestaurantInfo("종로황소곱창", "한식", "곱창막창", "02-723-5157",
                "서울 종로구 관철동 18-8", "소곱창구이, 냉면", "서울 종로구 우정국로2길 31", "http://place.map.kakao.com/21396905",
                "21396905","깔끔한", "https://d2uja84sd90jmv.cloudfront.net/posts/LJ_IYGvldp6xqfk7mQhaKw/m.jpg"));

        arr.add(new RestaurantInfo("이강순실비집", "한식", "해물생선", "02-737-7880",
                "서울 종로구 관철동 11-11", "산낙지볶음, 낙지볶음", "서울 종로구 청계천로 75-1", "http://place.map.kakao.com/27146280",
                "27146280", "가성비좋은", "https://t1.daumcdn.net/cfile/tistory/253EDF3F532338B30A"));
        
        //패스트푸드
        arr.add(new RestaurantInfo("쉐이크쉑", "패스트푸드", "햄버거", "02-2158-7575",
                "서울특별시 종로구 청진동 종로 33", "불고기버거", "서울특별시 종로구 청진동 종로 33", "https://place.map.kakao.com/2038128499",
                "2038128499", "조용한", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTExMjhfNzEg%2FMDAxNjM4MDU5NzkzNTY0.exLLp04Q1XYfWVeWWYV2kZZlu7StQh-uRXDkxsUU0Kog.Dcmbrh_YfqKFxOwpw94NSy-ODnkgU1W41AZLxSRo_b4g.JPEG.hmdw1121103%2F20211126%25A3%25DF193306.jpg&type=sc960_832"));
        
        arr.add(new RestaurantInfo("플레이크", "패스트푸드", "햄버거", "02-734-1050",
                "서울특별시 종로구 관철동 155", "미국수제버거", "서울특별시 종로구 관철동 155", "https://place.map.kakao.com/1119745454",
                "1119745454", "가성비좋은", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA2MTlfMjI5%2FMDAxNjI0MTAyNTM4NjQ4.3y6--orCIdUjpqaArZW7JWhMMaRnZCjyA-bpFky46HMg.40ugUTSlpHFHv5gefUURBi-sSwYWAccmHkdQncrMR4Ug.JPEG.zooyenzzang%2F20210601_121131.jpg&type=sc960_832"));

        arr.add(new RestaurantInfo("양키스버거", "패스트푸드", "햄버거", "0507-1441-0815",
                "서울특별시 종로구 삼일대로 30길 30", "더블버거", "서울특별시 종로구 삼일대로 30길 30", "https://place.map.kakao.com/1044877256",
                "1044877256", "깔끔한", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA1MjRfODgg%2FMDAxNjIxODYyODA5Mzcx.z-FwpuMTVx_DMbknMm--W8KXWjncug5ym0Ks9c6Uat4g.gBfi9Hv1TzoijBHhkMj5Vo1tXriDk2SkbV8U88ef_GUg.JPEG.company4132%2FIMG_1076.JPG"));
        
        
        
        //샐러드
        arr.add(new RestaurantInfo("샐러디", "샐러드", "샐러드", "02-6956-7996",
                "서울 종로구 청계천로 61 6층", "칠리베이컨 웜볼", "서울 종로구 청계천로 61 청계천빌딩 6층", "https://place.map.kakao.com/1553660349",
                "1553660349", "조용한", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTEwMjlfNjAg%2FMDAxNjM1NDk0NjIwMDY0.IEyUlUdJcGjZzjm_TWQcDr7TCw9imT3b5OIRN4AKiIsg.yS2ny5cu2AP3OodfkgS2QyXDtUZM1Gz_15vDssqp_PEg.JPEG.jrue614%2FIMG_8819.jpg&type=sc960_832"));
        
        arr.add(new RestaurantInfo("어게인리프레쉬", "샐러드", "샐러드", "02-722-7717",
                "서울 종로구 삼일대로 383 2층", "연어&아포카도 샐러드", "서울 종로구 삼일대로 383 2층 6층", "https://place.map.kakao.com/601008620",
                "601008620", "가성비좋은", "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDA2MDRfMjcg%2FMDAxNTkxMjUxMTM3NTI1.U3cRulip3yCBm4TUyXgcogPTbWAAX6ZwS2uo7p2qfmEg.GRUHx3WAqggipprfTq4Ebjm9_uolOVmNuA1sp7psqVsg.JPEG.ghkwack%2FKakaoTalk_20200528_004359768_16.jpg&type=sc960_832"));
        
        arr.add(new RestaurantInfo("크리스피프레시", "샐러드", "샐러드", "02-6466-7180",
                "서울 중구 청계천로 24 1층", "비프 샐러드", "서울 중구 청계천로 24 케이스퀘어시티 1층", "https://place.map.kakao.com/53212532",
                "53212532", "깔끔한", "https://search.pstatic.net/common/?autoRotate=true&quality=95&type=w750&src=https%3A%2F%2Fmyplace-phinf.pstatic.net%2F20211101_256%2F1635767040697zb41s_JPEG%2Fupload_e09263ccc6e15bc0c88138a599c80549.jpeg"));
        
		return arr;

	}

}
