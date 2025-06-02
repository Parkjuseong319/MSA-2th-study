package kr.co.mycom.service;

import java.util.HashMap;
import java.util.List;

import kr.co.mycom.model.BoardDTO;

public interface BoardService {
	
	public void insertBoard(BoardDTO dto);
	public List<BoardDTO> getBoardList(HashMap map);	// selectAll
	public BoardDTO getBoard(int num);	// selectByNum
	public int getBoardCount();
	
	public int deleteBoard(BoardDTO dto);
    public int updateHit(int num);
    public int updateBoard(BoardDTO dto);
    public void insertReply(BoardDTO dto);
    public void updateSort(BoardDTO dto);
	// delete, update,...
}
