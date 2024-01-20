package org.study.springboot.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller // 컴포넌트 검색에 의해 자동으로 컨텍스트에 빈으로 등록되기 위해 지정
@RequestMapping("/") // 요청 처리하는 모든 메서드를 해당 기본 경로로 매핑
public class BookController {

    private static final String reader = "craig";

    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String readersBooks(Model model) {
        List<Book> books = bookRepository.findByReader(reader);
        if (books != null) {
            model.addAttribute("books", books);
        }
        return "readingList"; // 렌더링할 논리적 뷰 이름
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addToReadingList(Book book) {
        book.setReader(reader);
        bookRepository.save(book);
        return "redirect:/";
    }
}
