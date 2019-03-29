import { TestBed, inject } from '@angular/core/testing';

import { TipoMviService } from './tipo-mvi.service';

describe('TipoMviService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [TipoMviService]
    });
  });

  it('should be created', inject([TipoMviService], (service: TipoMviService) => {
    expect(service).toBeTruthy();
  }));
});
