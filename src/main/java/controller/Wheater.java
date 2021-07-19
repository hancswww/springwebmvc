package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Service
public class Wheater {

	public String weatherData() {
		String address="http://apis.data.go.kr/1360000/TourStnInfoService/getCityTourClmIdx?serviceKey=uM73FRFMgpboVDCugtsdwWkNKzGf8E8tpuii9790h2dbDAKe8NqhrgPSQX59T3KQJXhu77drzOviMeDaSrnLxA%3D%3D&pageNo=1&numOfRows=10&dataType=XML&CURRENT_DATE=2019122010&DAY=3&CITY_AREA_ID=5013000000";
		String data="";
		try {
			URL url=new URL(address);
			URLConnection uc=url.openConnection();
			BufferedReader in=new BufferedReader(new InputStreamReader(uc.getInputStream()));

			String line;
			while((line=in.readLine())!=null) {
				data+=line;
			}
			in.close();
			return data;
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
	
	/*
	public static void main(String[] args) {
		String address="http://apis.data.go.kr/1360000/TourStnInfoService/getCityTourClmIdx?serviceKey=uM73FRFMgpboVDCugtsdwWkNKzGf8E8tpuii9790h2dbDAKe8NqhrgPSQX59T3KQJXhu77drzOviMeDaSrnLxA%3D%3D&pageNo=1&numOfRows=10&dataType=XML&CURRENT_DATE=2019122010&DAY=3&CITY_AREA_ID=5013000000";
		
		try {
			URL url=new URL(address);
			URLConnection uc=url.openConnection();
			BufferedReader in=new BufferedReader(new InputStreamReader(uc.getInputStream()));

			String line;
			while((line=in.readLine())!=null) {
				System.out.println(line);
			}
			in.close();
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	 */
}
