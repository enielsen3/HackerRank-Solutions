class Checker implements Comparator<Player> {
  	
	public int compare(Player a, Player b) {
        if(a.score == b.score){
            return a.name.compareToIgnoreCase(b.name) < 0 ? -1 : 1;
        }
        return a.score > b.score ? -1 : 1;
    }
}
