%ypopsifia arxeia
%files=[187 642 292 270 289 526 970 175 469 700];
%disp(files(2)+files(2));
%ari8mos diskwn

%xwritikothta diskwn
%diskCapacity=d*1000;

%upopsifia lusi
%chrome=[0 1 1 0 0 0 0 0 0 1]; %1634
%allh ypopsifia lysi  [0 1 1 0 1 0 0 0 0 1]= 1923
%mia akatallhlh lysy [0 1 1 0 1 0 0 0 1 1]=2103

function F=fitnessfun(files)
files=[187 642 292 270 289 526 970 175 469 700];
d=2 ;
diskCapacity=d*1000;
F=diskCapacity-(files(2)+files(3)+files(10));
end

