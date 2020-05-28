$(function(){
	$('.teacherInfo .ther_icon').click(function(){
		if($(this).hasClass('less')){
			$(this).parents('.teacherInfo').find('.more').hide();
			$(this).parents('.teacherInfo').find('.simple').show();
			$(this).removeClass('less')
		}else{
			$(this).parents('.teacherInfo').find('.more').show();
			$(this).parents('.teacherInfo').find('.simple').hide();
			$(this).addClass('less')
		}
	})

	$('.header .search a').click(function(){
		$(this).toggleClass('active');
		$(this).next().toggle();
	})

	$('.header .search dd').click(function(){
		$(this).parents('.search').find('input').val($(this).text());
		$(this).parents('.search').find('a').removeClass('active');
		$(this).parent().hide();
	})

	$('.classIndex h3 .more').click(function(){
		$(this).next().toggle();
		$(this).parent().toggleClass('positonIndex')
	})

	$('.fudaoDiv .futab .more').click(function(){
		$(this).next().toggle();
		$(this).parent().toggleClass('positonIndex')
	})

	$('.checkboxModel input').click(function(){
		if(this.checked){
			$(this).parent().addClass('active')
		}else{
			$(this).parent().removeClass('active')
		}
	})

	$('.radioModel input').click(function(){
		var name = this.name;
		$(".radioModel input[name='"+name+"']").each(function(index,item){
			if(item.checked){
				$(item).parent().addClass('active')
			}else{
				$(item).parent().removeClass('active')
			}
		})
	})

	$('.paperLibrary .aside .title span, .intelligentAnalysis .aside .title span').click(function(){
		$(this).parent('.title').find('.down').toggle();
	})


	$('.tableBox th .checkboxModel input').off('click').on('click',function(){
		if(this.checked){
			$(this).parent().addClass('active');
			$(this).parents('.tableBox').find('td .checkboxModel').addClass('active');
			$(this).parents('.tableBox').find('td .checkboxModel input').prop('checked',true)
		}else{
			$(this).parent().removeClass('active');
			$(this).parents('.tableBox').find('td .checkboxModel').removeClass('active');
			$(this).parents('.tableBox').find('td .checkboxModel input').prop('checked',false)
		}
	})

	$('.tableBox td .checkboxModel input').off('click').on('click',function(){
		if(this.checked){
			$(this).parent().addClass('active');
			var td_span = $(this).parents('.tableBox').find('td .checkboxModel');
			var td_span_active = $(this).parents('.tableBox').find('td .active');
			if(td_span.length == td_span_active.length){
				$(this).parents('.tableBox').find('th .checkboxModel').addClass('active');
				$(this).parents('.tableBox').find('th .checkboxModel input').prop('checked',true)
			}
		}else{
			$(this).parent().removeClass('active');
			$(this).parents('.tableBox').find('th .checkboxModel').removeClass('active');
			$(this).parents('.tableBox').find('th .checkboxModel input').prop('checked',false)
		}
	})
})