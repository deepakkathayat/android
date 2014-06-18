/****************************************************************************
 ****************************************************************************
 ***
 ***   This header was automatically generated from a Linux kernel header
 ***   of the same name, to make information necessary for userspace to
 ***   call into the kernel available to libc.  It contains only constants,
 ***   structures, and macros generated from the original header, and thus,
 ***   contains no copyrightable information.
 ***
 ***   To edit the content of this header, modify the corresponding
 ***   source file (e.g. under external/kernel-headers/original/) then
 ***   run bionic/libc/kernel/tools/update_all.py
 ***
 ***   Any manual change here will be lost the next time this script will
 ***   be run. You've been warned!
 ***
 ****************************************************************************
 ****************************************************************************/
#ifndef _UAPI__ASM_ARM_UNISTD_H
#define _UAPI__ASM_ARM_UNISTD_H
#define __NR_OABI_SYSCALL_BASE 0x900000
#define __NR_SYSCALL_BASE 0
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_restart_syscall (__NR_SYSCALL_BASE+ 0)
#define __NR_exit (__NR_SYSCALL_BASE+ 1)
#define __NR_fork (__NR_SYSCALL_BASE+ 2)
#define __NR_read (__NR_SYSCALL_BASE+ 3)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_write (__NR_SYSCALL_BASE+ 4)
#define __NR_open (__NR_SYSCALL_BASE+ 5)
#define __NR_close (__NR_SYSCALL_BASE+ 6)
#define __NR_creat (__NR_SYSCALL_BASE+ 8)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_link (__NR_SYSCALL_BASE+ 9)
#define __NR_unlink (__NR_SYSCALL_BASE+ 10)
#define __NR_execve (__NR_SYSCALL_BASE+ 11)
#define __NR_chdir (__NR_SYSCALL_BASE+ 12)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_time (__NR_SYSCALL_BASE+ 13)
#define __NR_mknod (__NR_SYSCALL_BASE+ 14)
#define __NR_chmod (__NR_SYSCALL_BASE+ 15)
#define __NR_lchown (__NR_SYSCALL_BASE+ 16)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_lseek (__NR_SYSCALL_BASE+ 19)
#define __NR_getpid (__NR_SYSCALL_BASE+ 20)
#define __NR_mount (__NR_SYSCALL_BASE+ 21)
#define __NR_umount (__NR_SYSCALL_BASE+ 22)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_setuid (__NR_SYSCALL_BASE+ 23)
#define __NR_getuid (__NR_SYSCALL_BASE+ 24)
#define __NR_stime (__NR_SYSCALL_BASE+ 25)
#define __NR_ptrace (__NR_SYSCALL_BASE+ 26)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_alarm (__NR_SYSCALL_BASE+ 27)
#define __NR_pause (__NR_SYSCALL_BASE+ 29)
#define __NR_utime (__NR_SYSCALL_BASE+ 30)
#define __NR_access (__NR_SYSCALL_BASE+ 33)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_nice (__NR_SYSCALL_BASE+ 34)
#define __NR_sync (__NR_SYSCALL_BASE+ 36)
#define __NR_kill (__NR_SYSCALL_BASE+ 37)
#define __NR_rename (__NR_SYSCALL_BASE+ 38)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_mkdir (__NR_SYSCALL_BASE+ 39)
#define __NR_rmdir (__NR_SYSCALL_BASE+ 40)
#define __NR_dup (__NR_SYSCALL_BASE+ 41)
#define __NR_pipe (__NR_SYSCALL_BASE+ 42)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_times (__NR_SYSCALL_BASE+ 43)
#define __NR_brk (__NR_SYSCALL_BASE+ 45)
#define __NR_setgid (__NR_SYSCALL_BASE+ 46)
#define __NR_getgid (__NR_SYSCALL_BASE+ 47)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_geteuid (__NR_SYSCALL_BASE+ 49)
#define __NR_getegid (__NR_SYSCALL_BASE+ 50)
#define __NR_acct (__NR_SYSCALL_BASE+ 51)
#define __NR_umount2 (__NR_SYSCALL_BASE+ 52)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_ioctl (__NR_SYSCALL_BASE+ 54)
#define __NR_fcntl (__NR_SYSCALL_BASE+ 55)
#define __NR_setpgid (__NR_SYSCALL_BASE+ 57)
#define __NR_umask (__NR_SYSCALL_BASE+ 60)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_chroot (__NR_SYSCALL_BASE+ 61)
#define __NR_ustat (__NR_SYSCALL_BASE+ 62)
#define __NR_dup2 (__NR_SYSCALL_BASE+ 63)
#define __NR_getppid (__NR_SYSCALL_BASE+ 64)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_getpgrp (__NR_SYSCALL_BASE+ 65)
#define __NR_setsid (__NR_SYSCALL_BASE+ 66)
#define __NR_sigaction (__NR_SYSCALL_BASE+ 67)
#define __NR_setreuid (__NR_SYSCALL_BASE+ 70)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_setregid (__NR_SYSCALL_BASE+ 71)
#define __NR_sigsuspend (__NR_SYSCALL_BASE+ 72)
#define __NR_sigpending (__NR_SYSCALL_BASE+ 73)
#define __NR_sethostname (__NR_SYSCALL_BASE+ 74)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_setrlimit (__NR_SYSCALL_BASE+ 75)
#define __NR_getrlimit (__NR_SYSCALL_BASE+ 76)
#define __NR_getrusage (__NR_SYSCALL_BASE+ 77)
#define __NR_gettimeofday (__NR_SYSCALL_BASE+ 78)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_settimeofday (__NR_SYSCALL_BASE+ 79)
#define __NR_getgroups (__NR_SYSCALL_BASE+ 80)
#define __NR_setgroups (__NR_SYSCALL_BASE+ 81)
#define __NR_select (__NR_SYSCALL_BASE+ 82)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_symlink (__NR_SYSCALL_BASE+ 83)
#define __NR_readlink (__NR_SYSCALL_BASE+ 85)
#define __NR_uselib (__NR_SYSCALL_BASE+ 86)
#define __NR_swapon (__NR_SYSCALL_BASE+ 87)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_reboot (__NR_SYSCALL_BASE+ 88)
#define __NR_readdir (__NR_SYSCALL_BASE+ 89)
#define __NR_mmap (__NR_SYSCALL_BASE+ 90)
#define __NR_munmap (__NR_SYSCALL_BASE+ 91)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_truncate (__NR_SYSCALL_BASE+ 92)
#define __NR_ftruncate (__NR_SYSCALL_BASE+ 93)
#define __NR_fchmod (__NR_SYSCALL_BASE+ 94)
#define __NR_fchown (__NR_SYSCALL_BASE+ 95)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_getpriority (__NR_SYSCALL_BASE+ 96)
#define __NR_setpriority (__NR_SYSCALL_BASE+ 97)
#define __NR_statfs (__NR_SYSCALL_BASE+ 99)
#define __NR_fstatfs (__NR_SYSCALL_BASE+100)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_socketcall (__NR_SYSCALL_BASE+102)
#define __NR_syslog (__NR_SYSCALL_BASE+103)
#define __NR_setitimer (__NR_SYSCALL_BASE+104)
#define __NR_getitimer (__NR_SYSCALL_BASE+105)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_stat (__NR_SYSCALL_BASE+106)
#define __NR_lstat (__NR_SYSCALL_BASE+107)
#define __NR_fstat (__NR_SYSCALL_BASE+108)
#define __NR_vhangup (__NR_SYSCALL_BASE+111)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_syscall (__NR_SYSCALL_BASE+113)
#define __NR_wait4 (__NR_SYSCALL_BASE+114)
#define __NR_swapoff (__NR_SYSCALL_BASE+115)
#define __NR_sysinfo (__NR_SYSCALL_BASE+116)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_ipc (__NR_SYSCALL_BASE+117)
#define __NR_fsync (__NR_SYSCALL_BASE+118)
#define __NR_sigreturn (__NR_SYSCALL_BASE+119)
#define __NR_clone (__NR_SYSCALL_BASE+120)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_setdomainname (__NR_SYSCALL_BASE+121)
#define __NR_uname (__NR_SYSCALL_BASE+122)
#define __NR_adjtimex (__NR_SYSCALL_BASE+124)
#define __NR_mprotect (__NR_SYSCALL_BASE+125)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_sigprocmask (__NR_SYSCALL_BASE+126)
#define __NR_init_module (__NR_SYSCALL_BASE+128)
#define __NR_delete_module (__NR_SYSCALL_BASE+129)
#define __NR_quotactl (__NR_SYSCALL_BASE+131)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_getpgid (__NR_SYSCALL_BASE+132)
#define __NR_fchdir (__NR_SYSCALL_BASE+133)
#define __NR_bdflush (__NR_SYSCALL_BASE+134)
#define __NR_sysfs (__NR_SYSCALL_BASE+135)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_personality (__NR_SYSCALL_BASE+136)
#define __NR_setfsuid (__NR_SYSCALL_BASE+138)
#define __NR_setfsgid (__NR_SYSCALL_BASE+139)
#define __NR__llseek (__NR_SYSCALL_BASE+140)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_getdents (__NR_SYSCALL_BASE+141)
#define __NR__newselect (__NR_SYSCALL_BASE+142)
#define __NR_flock (__NR_SYSCALL_BASE+143)
#define __NR_msync (__NR_SYSCALL_BASE+144)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_readv (__NR_SYSCALL_BASE+145)
#define __NR_writev (__NR_SYSCALL_BASE+146)
#define __NR_getsid (__NR_SYSCALL_BASE+147)
#define __NR_fdatasync (__NR_SYSCALL_BASE+148)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR__sysctl (__NR_SYSCALL_BASE+149)
#define __NR_mlock (__NR_SYSCALL_BASE+150)
#define __NR_munlock (__NR_SYSCALL_BASE+151)
#define __NR_mlockall (__NR_SYSCALL_BASE+152)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_munlockall (__NR_SYSCALL_BASE+153)
#define __NR_sched_setparam (__NR_SYSCALL_BASE+154)
#define __NR_sched_getparam (__NR_SYSCALL_BASE+155)
#define __NR_sched_setscheduler (__NR_SYSCALL_BASE+156)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_sched_getscheduler (__NR_SYSCALL_BASE+157)
#define __NR_sched_yield (__NR_SYSCALL_BASE+158)
#define __NR_sched_get_priority_max (__NR_SYSCALL_BASE+159)
#define __NR_sched_get_priority_min (__NR_SYSCALL_BASE+160)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_sched_rr_get_interval (__NR_SYSCALL_BASE+161)
#define __NR_nanosleep (__NR_SYSCALL_BASE+162)
#define __NR_mremap (__NR_SYSCALL_BASE+163)
#define __NR_setresuid (__NR_SYSCALL_BASE+164)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_getresuid (__NR_SYSCALL_BASE+165)
#define __NR_poll (__NR_SYSCALL_BASE+168)
#define __NR_nfsservctl (__NR_SYSCALL_BASE+169)
#define __NR_setresgid (__NR_SYSCALL_BASE+170)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_getresgid (__NR_SYSCALL_BASE+171)
#define __NR_prctl (__NR_SYSCALL_BASE+172)
#define __NR_rt_sigreturn (__NR_SYSCALL_BASE+173)
#define __NR_rt_sigaction (__NR_SYSCALL_BASE+174)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_rt_sigprocmask (__NR_SYSCALL_BASE+175)
#define __NR_rt_sigpending (__NR_SYSCALL_BASE+176)
#define __NR_rt_sigtimedwait (__NR_SYSCALL_BASE+177)
#define __NR_rt_sigqueueinfo (__NR_SYSCALL_BASE+178)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_rt_sigsuspend (__NR_SYSCALL_BASE+179)
#define __NR_pread64 (__NR_SYSCALL_BASE+180)
#define __NR_pwrite64 (__NR_SYSCALL_BASE+181)
#define __NR_chown (__NR_SYSCALL_BASE+182)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_getcwd (__NR_SYSCALL_BASE+183)
#define __NR_capget (__NR_SYSCALL_BASE+184)
#define __NR_capset (__NR_SYSCALL_BASE+185)
#define __NR_sigaltstack (__NR_SYSCALL_BASE+186)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_sendfile (__NR_SYSCALL_BASE+187)
#define __NR_vfork (__NR_SYSCALL_BASE+190)
#define __NR_ugetrlimit (__NR_SYSCALL_BASE+191)
#define __NR_mmap2 (__NR_SYSCALL_BASE+192)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_truncate64 (__NR_SYSCALL_BASE+193)
#define __NR_ftruncate64 (__NR_SYSCALL_BASE+194)
#define __NR_stat64 (__NR_SYSCALL_BASE+195)
#define __NR_lstat64 (__NR_SYSCALL_BASE+196)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_fstat64 (__NR_SYSCALL_BASE+197)
#define __NR_lchown32 (__NR_SYSCALL_BASE+198)
#define __NR_getuid32 (__NR_SYSCALL_BASE+199)
#define __NR_getgid32 (__NR_SYSCALL_BASE+200)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_geteuid32 (__NR_SYSCALL_BASE+201)
#define __NR_getegid32 (__NR_SYSCALL_BASE+202)
#define __NR_setreuid32 (__NR_SYSCALL_BASE+203)
#define __NR_setregid32 (__NR_SYSCALL_BASE+204)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_getgroups32 (__NR_SYSCALL_BASE+205)
#define __NR_setgroups32 (__NR_SYSCALL_BASE+206)
#define __NR_fchown32 (__NR_SYSCALL_BASE+207)
#define __NR_setresuid32 (__NR_SYSCALL_BASE+208)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_getresuid32 (__NR_SYSCALL_BASE+209)
#define __NR_setresgid32 (__NR_SYSCALL_BASE+210)
#define __NR_getresgid32 (__NR_SYSCALL_BASE+211)
#define __NR_chown32 (__NR_SYSCALL_BASE+212)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_setuid32 (__NR_SYSCALL_BASE+213)
#define __NR_setgid32 (__NR_SYSCALL_BASE+214)
#define __NR_setfsuid32 (__NR_SYSCALL_BASE+215)
#define __NR_setfsgid32 (__NR_SYSCALL_BASE+216)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_getdents64 (__NR_SYSCALL_BASE+217)
#define __NR_pivot_root (__NR_SYSCALL_BASE+218)
#define __NR_mincore (__NR_SYSCALL_BASE+219)
#define __NR_madvise (__NR_SYSCALL_BASE+220)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_fcntl64 (__NR_SYSCALL_BASE+221)
#define __NR_gettid (__NR_SYSCALL_BASE+224)
#define __NR_readahead (__NR_SYSCALL_BASE+225)
#define __NR_setxattr (__NR_SYSCALL_BASE+226)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_lsetxattr (__NR_SYSCALL_BASE+227)
#define __NR_fsetxattr (__NR_SYSCALL_BASE+228)
#define __NR_getxattr (__NR_SYSCALL_BASE+229)
#define __NR_lgetxattr (__NR_SYSCALL_BASE+230)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_fgetxattr (__NR_SYSCALL_BASE+231)
#define __NR_listxattr (__NR_SYSCALL_BASE+232)
#define __NR_llistxattr (__NR_SYSCALL_BASE+233)
#define __NR_flistxattr (__NR_SYSCALL_BASE+234)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_removexattr (__NR_SYSCALL_BASE+235)
#define __NR_lremovexattr (__NR_SYSCALL_BASE+236)
#define __NR_fremovexattr (__NR_SYSCALL_BASE+237)
#define __NR_tkill (__NR_SYSCALL_BASE+238)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_sendfile64 (__NR_SYSCALL_BASE+239)
#define __NR_futex (__NR_SYSCALL_BASE+240)
#define __NR_sched_setaffinity (__NR_SYSCALL_BASE+241)
#define __NR_sched_getaffinity (__NR_SYSCALL_BASE+242)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_io_setup (__NR_SYSCALL_BASE+243)
#define __NR_io_destroy (__NR_SYSCALL_BASE+244)
#define __NR_io_getevents (__NR_SYSCALL_BASE+245)
#define __NR_io_submit (__NR_SYSCALL_BASE+246)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_io_cancel (__NR_SYSCALL_BASE+247)
#define __NR_exit_group (__NR_SYSCALL_BASE+248)
#define __NR_lookup_dcookie (__NR_SYSCALL_BASE+249)
#define __NR_epoll_create (__NR_SYSCALL_BASE+250)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_epoll_ctl (__NR_SYSCALL_BASE+251)
#define __NR_epoll_wait (__NR_SYSCALL_BASE+252)
#define __NR_remap_file_pages (__NR_SYSCALL_BASE+253)
#define __NR_set_tid_address (__NR_SYSCALL_BASE+256)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_timer_create (__NR_SYSCALL_BASE+257)
#define __NR_timer_settime (__NR_SYSCALL_BASE+258)
#define __NR_timer_gettime (__NR_SYSCALL_BASE+259)
#define __NR_timer_getoverrun (__NR_SYSCALL_BASE+260)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_timer_delete (__NR_SYSCALL_BASE+261)
#define __NR_clock_settime (__NR_SYSCALL_BASE+262)
#define __NR_clock_gettime (__NR_SYSCALL_BASE+263)
#define __NR_clock_getres (__NR_SYSCALL_BASE+264)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_clock_nanosleep (__NR_SYSCALL_BASE+265)
#define __NR_statfs64 (__NR_SYSCALL_BASE+266)
#define __NR_fstatfs64 (__NR_SYSCALL_BASE+267)
#define __NR_tgkill (__NR_SYSCALL_BASE+268)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_utimes (__NR_SYSCALL_BASE+269)
#define __NR_arm_fadvise64_64 (__NR_SYSCALL_BASE+270)
#define __NR_pciconfig_iobase (__NR_SYSCALL_BASE+271)
#define __NR_pciconfig_read (__NR_SYSCALL_BASE+272)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_pciconfig_write (__NR_SYSCALL_BASE+273)
#define __NR_mq_open (__NR_SYSCALL_BASE+274)
#define __NR_mq_unlink (__NR_SYSCALL_BASE+275)
#define __NR_mq_timedsend (__NR_SYSCALL_BASE+276)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_mq_timedreceive (__NR_SYSCALL_BASE+277)
#define __NR_mq_notify (__NR_SYSCALL_BASE+278)
#define __NR_mq_getsetattr (__NR_SYSCALL_BASE+279)
#define __NR_waitid (__NR_SYSCALL_BASE+280)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_socket (__NR_SYSCALL_BASE+281)
#define __NR_bind (__NR_SYSCALL_BASE+282)
#define __NR_connect (__NR_SYSCALL_BASE+283)
#define __NR_listen (__NR_SYSCALL_BASE+284)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_accept (__NR_SYSCALL_BASE+285)
#define __NR_getsockname (__NR_SYSCALL_BASE+286)
#define __NR_getpeername (__NR_SYSCALL_BASE+287)
#define __NR_socketpair (__NR_SYSCALL_BASE+288)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_send (__NR_SYSCALL_BASE+289)
#define __NR_sendto (__NR_SYSCALL_BASE+290)
#define __NR_recv (__NR_SYSCALL_BASE+291)
#define __NR_recvfrom (__NR_SYSCALL_BASE+292)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_shutdown (__NR_SYSCALL_BASE+293)
#define __NR_setsockopt (__NR_SYSCALL_BASE+294)
#define __NR_getsockopt (__NR_SYSCALL_BASE+295)
#define __NR_sendmsg (__NR_SYSCALL_BASE+296)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_recvmsg (__NR_SYSCALL_BASE+297)
#define __NR_semop (__NR_SYSCALL_BASE+298)
#define __NR_semget (__NR_SYSCALL_BASE+299)
#define __NR_semctl (__NR_SYSCALL_BASE+300)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_msgsnd (__NR_SYSCALL_BASE+301)
#define __NR_msgrcv (__NR_SYSCALL_BASE+302)
#define __NR_msgget (__NR_SYSCALL_BASE+303)
#define __NR_msgctl (__NR_SYSCALL_BASE+304)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_shmat (__NR_SYSCALL_BASE+305)
#define __NR_shmdt (__NR_SYSCALL_BASE+306)
#define __NR_shmget (__NR_SYSCALL_BASE+307)
#define __NR_shmctl (__NR_SYSCALL_BASE+308)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_add_key (__NR_SYSCALL_BASE+309)
#define __NR_request_key (__NR_SYSCALL_BASE+310)
#define __NR_keyctl (__NR_SYSCALL_BASE+311)
#define __NR_semtimedop (__NR_SYSCALL_BASE+312)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_vserver (__NR_SYSCALL_BASE+313)
#define __NR_ioprio_set (__NR_SYSCALL_BASE+314)
#define __NR_ioprio_get (__NR_SYSCALL_BASE+315)
#define __NR_inotify_init (__NR_SYSCALL_BASE+316)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_inotify_add_watch (__NR_SYSCALL_BASE+317)
#define __NR_inotify_rm_watch (__NR_SYSCALL_BASE+318)
#define __NR_mbind (__NR_SYSCALL_BASE+319)
#define __NR_get_mempolicy (__NR_SYSCALL_BASE+320)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_set_mempolicy (__NR_SYSCALL_BASE+321)
#define __NR_openat (__NR_SYSCALL_BASE+322)
#define __NR_mkdirat (__NR_SYSCALL_BASE+323)
#define __NR_mknodat (__NR_SYSCALL_BASE+324)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_fchownat (__NR_SYSCALL_BASE+325)
#define __NR_futimesat (__NR_SYSCALL_BASE+326)
#define __NR_fstatat64 (__NR_SYSCALL_BASE+327)
#define __NR_unlinkat (__NR_SYSCALL_BASE+328)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_renameat (__NR_SYSCALL_BASE+329)
#define __NR_linkat (__NR_SYSCALL_BASE+330)
#define __NR_symlinkat (__NR_SYSCALL_BASE+331)
#define __NR_readlinkat (__NR_SYSCALL_BASE+332)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_fchmodat (__NR_SYSCALL_BASE+333)
#define __NR_faccessat (__NR_SYSCALL_BASE+334)
#define __NR_pselect6 (__NR_SYSCALL_BASE+335)
#define __NR_ppoll (__NR_SYSCALL_BASE+336)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_unshare (__NR_SYSCALL_BASE+337)
#define __NR_set_robust_list (__NR_SYSCALL_BASE+338)
#define __NR_get_robust_list (__NR_SYSCALL_BASE+339)
#define __NR_splice (__NR_SYSCALL_BASE+340)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_arm_sync_file_range (__NR_SYSCALL_BASE+341)
#define __NR_sync_file_range2 __NR_arm_sync_file_range
#define __NR_tee (__NR_SYSCALL_BASE+342)
#define __NR_vmsplice (__NR_SYSCALL_BASE+343)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_move_pages (__NR_SYSCALL_BASE+344)
#define __NR_getcpu (__NR_SYSCALL_BASE+345)
#define __NR_epoll_pwait (__NR_SYSCALL_BASE+346)
#define __NR_kexec_load (__NR_SYSCALL_BASE+347)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_utimensat (__NR_SYSCALL_BASE+348)
#define __NR_signalfd (__NR_SYSCALL_BASE+349)
#define __NR_timerfd_create (__NR_SYSCALL_BASE+350)
#define __NR_eventfd (__NR_SYSCALL_BASE+351)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_fallocate (__NR_SYSCALL_BASE+352)
#define __NR_timerfd_settime (__NR_SYSCALL_BASE+353)
#define __NR_timerfd_gettime (__NR_SYSCALL_BASE+354)
#define __NR_signalfd4 (__NR_SYSCALL_BASE+355)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_eventfd2 (__NR_SYSCALL_BASE+356)
#define __NR_epoll_create1 (__NR_SYSCALL_BASE+357)
#define __NR_dup3 (__NR_SYSCALL_BASE+358)
#define __NR_pipe2 (__NR_SYSCALL_BASE+359)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_inotify_init1 (__NR_SYSCALL_BASE+360)
#define __NR_preadv (__NR_SYSCALL_BASE+361)
#define __NR_pwritev (__NR_SYSCALL_BASE+362)
#define __NR_rt_tgsigqueueinfo (__NR_SYSCALL_BASE+363)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_perf_event_open (__NR_SYSCALL_BASE+364)
#define __NR_recvmmsg (__NR_SYSCALL_BASE+365)
#define __NR_accept4 (__NR_SYSCALL_BASE+366)
#define __NR_fanotify_init (__NR_SYSCALL_BASE+367)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_fanotify_mark (__NR_SYSCALL_BASE+368)
#define __NR_prlimit64 (__NR_SYSCALL_BASE+369)
#define __NR_name_to_handle_at (__NR_SYSCALL_BASE+370)
#define __NR_open_by_handle_at (__NR_SYSCALL_BASE+371)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_clock_adjtime (__NR_SYSCALL_BASE+372)
#define __NR_syncfs (__NR_SYSCALL_BASE+373)
#define __NR_sendmmsg (__NR_SYSCALL_BASE+374)
#define __NR_setns (__NR_SYSCALL_BASE+375)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __NR_process_vm_readv (__NR_SYSCALL_BASE+376)
#define __NR_process_vm_writev (__NR_SYSCALL_BASE+377)
#define __NR_kcmp (__NR_SYSCALL_BASE+378)
#define __NR_finit_module (__NR_SYSCALL_BASE+379)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __ARM_NR_BASE (__NR_SYSCALL_BASE+0x0f0000)
#define __ARM_NR_breakpoint (__ARM_NR_BASE+1)
#define __ARM_NR_cacheflush (__ARM_NR_BASE+2)
#define __ARM_NR_usr26 (__ARM_NR_BASE+3)
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#define __ARM_NR_usr32 (__ARM_NR_BASE+4)
#define __ARM_NR_set_tls (__ARM_NR_BASE+5)
#undef __NR_time
#undef __NR_umount
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#undef __NR_stime
#undef __NR_alarm
#undef __NR_utime
#undef __NR_getrlimit
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#undef __NR_select
#undef __NR_readdir
#undef __NR_mmap
#undef __NR_socketcall
/* WARNING: DO NOT EDIT, AUTO-GENERATED CODE - SEE TOP FOR INSTRUCTIONS */
#undef __NR_syscall
#undef __NR_ipc
#endif
