public class Song {
    public String songName;
	public String artistName;
	public int artistAverage;
	public int streamsAverageCount;
	Song left, right;

	public Song() {
		this.songName = null;
		this.streamsAverageCount = 0;
		this.artistName = null;
		this.artistAverage = 0;
		left = null;
		right = null;
	}

	public Song(String songs, String artists, int count) {
		this.songName = songs;
		this.streamsAverageCount = count;
		this.artistName = artists;
		this.artistAverage = count;
		left = null;
		right = null;
	}

	public void setsongName(String songs) {
		this.songName = songs;
	}

	
	public String getsongName() {
		return this.songName;
	}

	public void setstreamsAverageCount(int count) {
		this.streamsAverageCount = count;
	}

	public int getstreamsAverageCount() {
		return this.streamsAverageCount;
	}

	public void setArtistName(String artists) {
		this.artistName = artists;
	}

	public String getArtistName() {
		return this.artistName;
	}

	public void setArtistAverage(Song obj) {
		this.artistAverage = (this.streamsAverageCount + obj.streamsAverageCount) / 2;
	}
}
