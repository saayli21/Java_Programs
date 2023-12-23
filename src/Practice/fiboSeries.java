package Practice;

public class fiboSeries {

	
        private String subName;
        private String paperName;
        private String centreName;
		public fiboSeries(String subName, String paperName, String centreName) {
			super();
			this.subName = subName;
			this.paperName = paperName;
			this.centreName = centreName;
		}
		private String getSubName() {
			return subName;
		}
		private String getPaperName() {
			return paperName;
		}
		private String getCentreName() {
			return centreName;
		}
		private void setSubName(String subName) {
			this.subName = subName;
		}
		private void setPaperName(String paperName) {
			this.paperName = paperName;
		}
		private void setCentreName(String centreName) {
			this.centreName = centreName;
		}
        
	   public static void main(String[] args) {
		fiboSeries f1=new fiboSeries("Geo", "GS1", "Delhi");
		System.out.println(f1.getSubName());
		f1.setSubName("Political Science");
		System.out.println(f1.getSubName());
	}
        
	}


