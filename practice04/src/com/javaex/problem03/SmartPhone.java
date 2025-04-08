package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
        if("앱".equals(str)) {
        	System.out.println("앱 실행");
        }else if("음악".equals(str)) {
        	playMusic();
        }else {
        	call();
        }
    }
 
    //메소드작성
    private void call() {
        System.out.println("통화기능시작");
    }
    //메소드작성
    protected void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
    
	/*
	 * 강사님 작성 코드 
	 * public void execute(String str) {
	 * 
	 * // 코드작성 if ("앱".equals(str)) { playApp(); } else { super.execute(str); }
	 * 
	 * }
	 * 
	 * // 메소드작성 public void playApp() { System.out.println("앱실행"); }
	 * 
	 * // 메소드작성 protected void playMusic(){ System.out.println("다운로드해서 음악재생"); }
	 */
    
}
