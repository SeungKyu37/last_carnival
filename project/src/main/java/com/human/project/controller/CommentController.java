package com.human.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.human.project.domain.Comment;
import com.human.project.service.CommentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/Comment")
public class CommentController {
	
	@Autowired
	private CommentService commentService;

	// 댓글 목록
	@GetMapping("/list")
	public String list(Model model, int boardNo) throws Exception {
		
		List<Comment> commentList = commentService.list(boardNo);
		model.addAttribute("commentList", commentList);
		

		return "/comment/list";
	}
	
	// 댓글 등록
	@PostMapping("/insert")
	public String insert(Model model, Comment comment) throws Exception {
		
		int result = commentService.insert(comment);
		
		if(result > 0) 			log.info("댓글 등록 성공...");
		else		 			log.info("댓글 등록 실패...");
		
		int boardNo = comment.getBoardNo();
		List<Comment> commentList = commentService.list(boardNo);
		model.addAttribute("commentList", commentList);
		
		return "/comment/list";
	}
	
	// 댓글 수정
	@PostMapping("/update")
	public String update(Model model, Comment comment) throws Exception {
		
		int result = commentService.update(comment);
		
		if(result > 0) 			log.info("댓글 수정 성공...");
		else		 			log.info("댓글 수정 실패...");
		
		int boardNo = comment.getBoardNo();
		List<Comment> commentList = commentService.list(boardNo);
		model.addAttribute("commentList", commentList);
		
		return "/Comment/list";
	}
	
	
	// 댓글 삭제
	@PostMapping("/delete")
	public String delete(Model model, Comment comment) throws Exception {
		
		int commentNo = comment.getCommentNo();
		
		int result = commentService.delete(commentNo);
		
		if(result > 0) 			log.info("댓글 삭제 성공...");
		else		 			log.info("댓글 삭제 실패...");
		
		int boardNo = comment.getBoardNo();
		List<Comment> commentList = commentService.list(boardNo);
		model.addAttribute("commentList", commentList);
		
		return "/Comment/list";
	}
	
	// 답글
	@PostMapping("/answer/insert")
	public String insertAnswer(Model model, Comment comment) throws Exception {
		
		// 답글 등록 요청
		int result = commentService.insertAnswer(comment);
		
		if(result > 0) 			log.info("답글 등록 성공...");
		else		 			log.info("답글 등록 실패...");
		
		// 댓글 목록 
		int boardNo = comment.getBoardNo();
		List<Comment> commentList = commentService.list(boardNo);
		model.addAttribute("commentList", commentList);

		return "/comment/list";
	}
	
	
	
}















