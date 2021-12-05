<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="clearfix copyright floatleft">
	<p>
		Copyright &copy; VinaEnter Edu. All rights reserved. Code by <span>Gia
			Huy</span>
	</p>
</div>
<div class="clearfix social floatright">
	<ul>
		<li><a class="tooltip" title="Facebook" href=""><i
				class="fa fa-facebook-square"></i></a></li>
		<li><a class="tooltip" title="Twitter" href=""><i
				class="fa fa-twitter-square"></i></a></li>
		<li><a class="tooltip" title="Google+" href=""><i
				class="fa fa-google-plus-square"></i></a></li>
	</ul>
</div>


<script type="text/javascript">
	$(function() {
		var input = document.createElement("input");
		if (('placeholder' in input) == false) {
			$('[placeholder]').focus(function() {
				var i = $(this);
				if (i.val() == i.attr('placeholder')) {
					i.val('').removeClass('placeholder');
					if (i.hasClass('password')) {
						i.removeClass('password');
						this.type = 'password';
					}
				}
			}).blur(function() {
				var i = $(this);
				if (i.val() == '' || i.val() == i.attr('placeholder')) {
					if (this.type == 'password') {
						i.addClass('password');
						this.type = 'text';
					}
					i.addClass('placeholder').val(i.attr('placeholder'));
				}
			}).blur().parents('form').submit(function() {
				$(this).find('[placeholder]').each(function() {
					var i = $(this);
					if (i.val() == i.attr('placeholder'))
						i.val('');
				})
			});
		}
	});
</script>