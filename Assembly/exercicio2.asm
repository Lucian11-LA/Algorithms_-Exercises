.data
	rs: .ascii "O resultado é: "
	
.text
  addi $s0,$zero,8
  addi $s1,$zero,4
  
  add $s2,$s1,$s0
  
  li $v0,4
  la $a0,rs
  syscall
  
  li $v0,1
  move $a0,$s2
  syscall
  
  
  
  
  
